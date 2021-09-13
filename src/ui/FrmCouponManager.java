package ui;

import control.CouponManager;
import model.BeanCoupon;
import util.BaseException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class FrmCouponManager extends JDialog implements ActionListener{
	private JPanel toolBar = new JPanel();
	private Button btnAdd = new Button("添加优惠券");
	private Button btnModify = new Button("修改优惠券");
//	private Button btnDelete = new Button("删除优惠券");
	private Object tblTitle[]={"优惠券编号","内容","所属网点","减免金额","起始日期","结束日期","是否可改"};
	private Object tblData[][];
	DefaultTableModel tablmod=new DefaultTableModel();
	private JTable couponTable=new JTable(tablmod);
	private void reloadTable(){
		try {
			List<BeanCoupon> types=(new CouponManager()).loadAllCoupon();
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
					if ((new CouponManager()).canModify(types.get(i).getCoupon_id()+"")==true){
						tblData[i][6]="是";
					}
					else {
						tblData[i][6]="否";
					}
					
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
	
	public FrmCouponManager(Frame f, String s, boolean b) {
		super(f, s, b);
		toolBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		toolBar.add(btnAdd);
		toolBar.add(btnModify);
//		toolBar.add(this.btnDelete);
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

		this.btnAdd.addActionListener(this);
		this.btnModify.addActionListener(this);
//		this.btnDelete.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.btnAdd){
			FrmCouponManager_AddCoupon dlg=new FrmCouponManager_AddCoupon(this,"添加优惠券",true);
			dlg.setVisible(true);
			if(dlg.getCoupon()!=null){//刷新表格
				this.reloadTable();
			}
		}
		else if(e.getSource()==this.btnModify){
			int i=this.couponTable.getSelectedRow();
			if(i<0) {
				JOptionPane.showMessageDialog(null,  "请选择优惠券","提示",JOptionPane.ERROR_MESSAGE);
				return;
			}
			try {
				if ((new CouponManager().canModify(this.tblData[i][0].toString())==true)) {
					BeanCoupon coupon=new BeanCoupon();
					coupon.setCoupon_id(Integer.valueOf(this.tblData[i][0].toString()));
					coupon.setContent(this.tblData[i][1].toString());
					coupon.setLocation_id(Integer.valueOf(this.tblData[i][2].toString()));
					coupon.setDiscount_amount(Float.valueOf(this.tblData[i][3].toString()));
					SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					try {
						coupon.setStart_date(simpleDateFormat.parse(this.tblData[i][4].toString()));
						coupon.setEnd_date(simpleDateFormat.parse(this.tblData[i][5].toString()));
					} catch (ParseException e2) {
						e2.printStackTrace();
					}
					
					FrmCouponManager_ModifyCoupon dlg=new FrmCouponManager_ModifyCoupon(this,"修改优惠券",true,coupon);
					dlg.setVisible(true);
					if(dlg.getCoupon()!=null){//刷新表格
						this.reloadTable();
					}
				}
				else {
					JOptionPane.showMessageDialog(null,  "已有用户持有该优惠券，无法修改","提示",JOptionPane.ERROR_MESSAGE);
				}
			} catch (NumberFormatException | BaseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}

	}
}
