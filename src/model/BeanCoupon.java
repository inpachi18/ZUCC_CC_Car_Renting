package model;

import java.util.Date;

public class BeanCoupon {
    private int coupon_id;
    private int location_id;
    private String content;
    private float discount_amount;
    private Date start_date;
    private Date end_date;
    private String status;
    private String received_status;

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getReceived_status() {
        return received_status;
    }
    public void setReceived_status(String received_status) {
        this.received_status = received_status;
    }

    public int getCoupon_id() {
        return coupon_id;
    }
    public void setCoupon_id(int coupon_id) {
        this.coupon_id = coupon_id;
    }
    public int getLocation_id() {
        return location_id;
    }
    public void setLocation_id(int location_id) {
        this.location_id=location_id;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public float getDiscount_amount() {
        return discount_amount;
    }
    public void setDiscount_amount(float discount_amount) {
        this.discount_amount = discount_amount;
    }
    public Date getStart_date() {
        return start_date;
    }
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }
    public Date getEnd_date() {
        return end_date;
    }
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
