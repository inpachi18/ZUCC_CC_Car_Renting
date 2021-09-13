package ui;

import control.CouponManager;
import control.StfManager;
import model.BeanCoupon;
import util.BaseException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FrmCouponManager_ModifyCoupon extends JDialog implements ActionListener{
	private BeanCoupon coupon=null;
	
	private JPanel toolBar = new JPanel();
	private JPanel workPane = new JPanel();
	private JPanel workPane2 = new JPanel();
	private Button btnOk = new Button("确定");
	private Button btnCancel = new Button("取消");
	private JLabel labelContent = new JLabel("内容：");
	private JLabel labelDiscount = new JLabel("减免金额：");
	private JLabel labelStart_date = new JLabel("起始日期：");
	private JLabel labelEnd_date = new JLabel("结束日期：");
	
	private JTextField edtContent = new JTextField(20);
	private JTextField edtDiscount = new JTextField(20);
	private JTextField edtStart_date = new JTextField(20);
	private JTextField edtEnd_date = new JTextField(20);
	public FrmCouponManager_ModifyCoupon(JDialog f, String s, boolean b,BeanCoupon coupon) {
		super(f, s, b);
		this.coupon=coupon;
		
		toolBar.setLayout(new FlowLayout(FlowLayout.RIGHT));
		toolBar.add(btnOk);
		toolBar.add(btnCancel);
		this.getContentPane().add(toolBar, BorderLayout.SOUTH);
		
		workPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
		workPane.add(labelContent);
		this.edtContent.setText(coupon.getContent());
		workPane.add(edtContent);
		workPane.add(labelDiscount);
		this.edtDiscount.setText(""+coupon.getDiscount_amount());
		workPane.add(edtDiscount);
		workPane.add(labelStart_date);
		this.edtStart_date.setText(""+new java.sql.Timestamp(coupon.getStart_date().getTime()));
		workPane.add(edtStart_date);
		workPane.add(labelEnd_date);
		this.edtEnd_date.setText(""+new java.sql.Timestamp(coupon.getEnd_date().getTime()));
		workPane.add(edtEnd_date);	
		this.getContentPane().add(workPane, BorderLayout.CENTER);
		
		this.setSize(300, 240);
		// 屏幕居中显示
		double width = Toolkit.getDefaultToolkit().getScreenSize().getWidth();
		double height = Toolkit.getDefaultToolkit().getScreenSize().getHeight();
		this.setLocation((int) (width - this.getWidth()) / 2,
				(int) (height - this.getHeight()) / 2);

		this.validate();
		this.btnOk.addActionListener(this);
		this.btnCancel.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				FrmCouponManager_ModifyCoupon.this.coupon=null;
			}
		});
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this.btnCancel) {
			this.setVisible(false);
			this.coupon=null;
			return;
		}
		else if(e.getSource()==this.btnOk){
			String content=this.edtContent.getText();
			String location_id = StfManager.currentStf.getBranch()+"";
			String discount=this.edtDiscount.getText();
			String start_date=this.edtStart_date.getText();
			String end_date=this.edtEnd_date.getText();
			
			coupon.setContent(content);
			coupon.setLocation_id(Integer.valueOf(location_id));
			coupon.setDiscount_amount(Float.parseFloat(discount));
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			try {
				coupon.setStart_date(simpleDateFormat.parse(start_date));
				coupon.setEnd_date(simpleDateFormat.parse(end_date));
			} catch (ParseException e2) {
				e2.printStackTrace();
			}
						
			try {
				(new CouponManager()).modifyCoupon(this.coupon);
				this.setVisible(false);
			} catch (BaseException e1) {
				this.coupon=null;
				JOptionPane.showMessageDialog(null, e1.getMessage(),"错误",JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}
	public BeanCoupon getCoupon() {
		return coupon;
	}
}
