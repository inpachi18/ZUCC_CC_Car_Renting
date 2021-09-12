package model;

import java.util.Date;

public class BeanFlashSale {
    /** 促销编号 */
    private Integer saleNumber ;
    /** 网点编号 */
    private Integer branchNumber ;
    /** 车辆型号 */
    private Integer carModel ;
    /** 促销折扣 */
    private Double saleDiscount ;
    /** 促销数量 */
    private Integer saleCount ;
    /** 起始日期 */
    private Date startDate ;
    /** 结束日期 */
    private Date finishDate ;

    public static final String[] tableTitles={"促销编号","网点编号","车辆型号","促销折扣","促销数量","起始日期","结束日期"};

    /** 促销编号 */
    public Integer getSaleNumber(){
        return this.saleNumber;
    }
    /** 促销编号 */
    public void setSaleNumber(Integer saleNumber){
        this.saleNumber=saleNumber;
    }
    /** 网点编号 */
    public Integer getBranchNumber(){
        return this.branchNumber;
    }
    /** 网点编号 */
    public void setBranchNumber(Integer branchNumber){
        this.branchNumber=branchNumber;
    }
    /** 车辆型号 */
    public Integer getCarModel(){
        return this.carModel;
    }
    /** 车辆型号 */
    public void setCarModel(Integer carModel){
        this.carModel=carModel;
    }
    /** 促销折扣 */
    public Double getSaleDiscount(){
        return this.saleDiscount;
    }
    /** 促销折扣 */
    public void setSaleDiscount(Double saleDiscount){
        this.saleDiscount=saleDiscount;
    }
    /** 促销数量 */
    public Integer getSaleCount(){
        return this.saleCount;
    }
    /** 促销数量 */
    public void setSaleCount(Integer saleCount){
        this.saleCount=saleCount;
    }
    /** 起始日期 */
    public Date getStartDate(){
        return this.startDate;
    }
    /** 起始日期 */
    public void setStartDate(Date startDate){
        this.startDate=startDate;
    }
    /** 结束日期 */
    public Date getFinishDate(){
        return this.finishDate;
    }
    /** 结束日期 */
    public void setFinishDate(Date finishDate){
        this.finishDate=finishDate;
    }
}
