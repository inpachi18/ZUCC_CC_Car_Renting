package model;

public class BeanCouponReceived {
	private int coupon_received_id;
	private String user_id;
	private int coupon_id;
	private String status;
	
	public int getCoupon_received_id() {
		return coupon_received_id;
	}
	public void setCoupon_received_id(int coupon_received_id) {
		this.coupon_received_id = coupon_received_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(int coupon_id) {
		this.coupon_id = coupon_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
