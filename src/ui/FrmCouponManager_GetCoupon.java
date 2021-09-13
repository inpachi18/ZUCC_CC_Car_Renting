package ui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import control.CouponManager;
import control.UserManager;
import model.BeanCoupon;
import model.BeanCouponReceived;
import util.BaseException;

public class FrmCouponManager_GetCoupon extends JDialog implements ActionListener{
	private JPanel toolBar = new JPanel();
	private Button btnGet = new Button("领取优惠券");
	private Object tblTitle[]={"优惠券编号","内容","所属网点","减免金额","起始日期","结束日期","状态"};
	private Object tblData[][];
	DefaultTableModel tablmod=new DefaultTableModel();
	private JTable couponTable=new JTable(tablmod);
	private void reloadTable(){
		try {
			List<BeanCoupon> types=(new CouponManager()).loadUnclaimedCoupon(String.valueOf(UserManager.currentUser.getNumber()));
			if (types==null) {
				tablmod.setDataVector(null,tblTitle);
			}
			else {
				tblData =new Object[types.size()][7];
				for(int i=0;i<types.size();i++){
					tblData[i][0]=types.get(i).getCoupon_id();
					tblData[i][1]=types.get(i).getContent();
					tblData[i][2]=types.get(i).getLocation_id();
					tblData[i][3]=types.get(i).getDiscount_amount();
					tblData[i][4]=types.get(i).getStart_date();
					tblData[i][5]=types.get(i).getEnd_date();
					tblData[i][6]=types.get(i).getStatus();
				}
				tablmod.setDataVector(tblData,tblTitle);
			}
			this.couponTable.validate();
			this.couponTable.repaint();
		} catch (BaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public FrmCouponManager_GetCoupon(Frame f, String s, boolean b) {
		super(f, s, b);
		toolBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		toolBar.add(btnGet);
		this.getContentPane().add(toolBar, BorderLayout.NORTH);
		//提取现有数据
		this.reloadTable();
		this.getContentPane().add(new JScrollPane(this.couponTable), BorderLayout.CENTER);
		
		// 屏幕居中显示
		this.setSize(800, 600);
		double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		this.setLocation((int) (width - this.getWidth()) / 2,
				(int) (height - this.getHeight()) / 2);

		this.validate();

		this.btnGet.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.btnGet){
			int i=this.couponTable.getSelectedRow();
			if(i<0) {
				JOptionPane.showMessageDialog(null,  "请选择优惠券","提示",JOptionPane.ERROR_MESSAGE);
				return;
			}
			BeanCouponReceived coupon=new BeanCouponReceived();
			coupon.setUser_id(String.valueOf(UserManager.currentUser.getNumber()));
			coupon.setCoupon_id(Integer.valueOf(this.tblData[i][0].toString()));
			String start_date = this.tblData[i][4].toString();
			String end_date = this.tblData[i][5].toString();
			try {
				(new CouponManager()).getCoupon(coupon,start_date,end_date);
				JOptionPane.showMessageDialog(null, "优惠券领取成功");  
				this.reloadTable();
			} catch (BaseException e1) {
				JOptionPane.showMessageDialog(null, e1.getMessage(),"错误",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
