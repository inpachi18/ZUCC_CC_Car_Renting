package model;

import java.util.Date;

public class BeanOrder {
    /** 订单编号 */
    private Integer orderNumber ;
    /** 用户编号 */
    private Integer userNumber ;
    /** 提车网点 */
    private Integer hireBranch ;
    /** 还车网点 */
    private Integer returnBranch ;
    /** 提车时间 */
    private Date hireDate ;
    /** 还车时间 */
    private Date returnDate ;
    /** 租车时长 */
    private Integer hireTime ;
    /** 原始金额 */
    private Double originalPrice ;
    /** 结算金额 */
    private Double finalPrice ;
    /** 优惠券编号 */
    private Integer couponNumber ;
    /** 订单状态 */
    private String orderState ;

    /** 订单编号 */
    public Integer getOrderNumber(){
        return this.orderNumber;
    }
    /** 订单编号 */
    public void setOrderNumber(Integer orderNumber){
        this.orderNumber=orderNumber;
    }
    /** 用户编号 */
    public Integer getUserNumber(){
        return this.userNumber;
    }
    /** 用户编号 */
    public void setUserNumber(Integer userNumber){
        this.userNumber=userNumber;
    }
    /** 提车网点 */
    public Integer getHireBranch(){
        return this.hireBranch;
    }
    /** 提车网点 */
    public void setHireBranch(Integer hireBranch){
        this.hireBranch=hireBranch;
    }
    /** 还车网点 */
    public Integer getReturnBranch(){
        return this.returnBranch;
    }
    /** 还车网点 */
    public void setReturnBranch(Integer returnBranch){
        this.returnBranch=returnBranch;
    }
    /** 提车时间 */
    public Date getHireDate(){
        return this.hireDate;
    }
    /** 提车时间 */
    public void setHireDate(Date hireDate){
        this.hireDate=hireDate;
    }
    /** 还车时间 */
    public Date getReturnDate(){
        return this.returnDate;
    }
    /** 还车时间 */
    public void setReturnDate(Date returnDate){
        this.returnDate=returnDate;
    }
    /** 租车时长 */
    public Integer getHireTime(){
        return this.hireTime;
    }
    /** 租车时长 */
    public void setHireTime(Integer hireTime){
        this.hireTime=hireTime;
    }
    /** 原始金额 */
    public Double getOriginalPrice(){
        return this.originalPrice;
    }
    /** 原始金额 */
    public void setOriginalPrice(Double originalPrice){
        this.originalPrice=originalPrice;
    }
    /** 结算金额 */
    public Double getFinalPrice(){
        return this.finalPrice;
    }
    /** 结算金额 */
    public void setFinalPrice(Double finalPrice){
        this.finalPrice=finalPrice;
    }
    /** 优惠券编号 */
    public Integer getCouponNumber(){
        return this.couponNumber;
    }
    /** 优惠券编号 */
    public void setCouponNumber(Integer couponNumber){
        this.couponNumber=couponNumber;
    }
    /** 订单状态 */
    public String getOrderState(){
        return this.orderState;
    }
    /** 订单状态 */
    public void setOrderState(String orderState){
        this.orderState=orderState;
    }
}
