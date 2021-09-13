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

public class FrmCouponManager_ReceivedCoupon extends JDialog {
	private JPanel toolBar = new JPanel();
	private Object tblTitle[]={"优惠券编号","内容","所属网点","减免金额","起始日期","结束日期","状态"};
	private Object tblData[][];
	DefaultTableModel tablmod=new DefaultTableModel();
	private JTable couponTable=new JTable(tablmod);
	private void reloadTable(){
		try {
			List<BeanCoupon> types=(new CouponManager()).loadReceivedCoupon(String.valueOf(UserManager.currentUser.getNumber()));
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
					tblData[i][6]=types.get(i).getReceived_status();
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
	
	public FrmCouponManager_ReceivedCoupon(Frame f, String s, boolean b) {
		super(f, s, b);
//		toolBar.setLayout(new FlowLayout(FlowLayout.LEFT));
//		toolBar.add(btnGet);
//		this.getContentPane().add(toolBar, BorderLayout.NORTH);
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

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//System.exit(0);
			}
		});
	}

}
