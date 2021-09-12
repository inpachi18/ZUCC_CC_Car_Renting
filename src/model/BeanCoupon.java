package model;

import java.util.Date;

public class BeanCoupon {
    /** 优惠券编号 */
    private Integer number ;
    /** 内容 */
    private String information ;
    /** 减免金额 */
    private Double discount ;
    /** 起始日期 */
    private Date startdate ;
    /** 结束日期 */
    private Date finishdate ;

    public static final String[] tableTitles={"优惠券编号","内容","减免金额","起始日期","结束日期"};

    /** 优惠券编号 */
    public Integer getNumber(){
        return this.number;
    }
    /** 优惠券编号 */
    public void setNumber(Integer number){
        this.number=number;
    }
    /** 内容 */
    public String getInformation(){
        return this.information;
    }
    /** 内容 */
    public void setInformation(String information){
        this.information=information;
    }
    /** 减免金额 */
    public Double getDiscount(){
        return this.discount;
    }
    /** 减免金额 */
    public void setDiscount(Double discount){
        this.discount=discount;
    }
    /** 起始日期 */
    public Date getStartdate(){
        return this.startdate;
    }
    /** 起始日期 */
    public void setStartdate(Date startdate){
        this.startdate=startdate;
    }
    /** 结束日期 */
    public Date getFinishdate(){
        return this.finishdate;
    }
    /** 结束日期 */
    public void setFinishdate(Date finishdate){
        this.finishdate=finishdate;
    }
}
