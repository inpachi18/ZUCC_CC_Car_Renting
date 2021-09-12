package model;

import java.util.Date;

public class BeanCarScrap {
    /** 报废编号 */
    private Integer scrapNumber ;
    /** 车辆编号 */
    private Integer carNumber ;
    /** 操作员编号 */
    private Integer stfNumber ;
    /** 报废时间 */
    private Date scrapDate ;
    /** 说明 */
    private String information ;

    public static final String[] tableTitles={"报废编号","车辆编号","操作员编号","报废时间","说明"};

    /** 报废编号 */
    public Integer getScrapNumber(){
        return this.scrapNumber;
    }
    /** 报废编号 */
    public void setScrapNumber(Integer scrapNumber){
        this.scrapNumber=scrapNumber;
    }
    /** 车辆编号 */
    public Integer getCarNumber(){
        return this.carNumber;
    }
    /** 车辆编号 */
    public void setCarNumber(Integer carNumber){
        this.carNumber=carNumber;
    }
    /** 操作员编号 */
    public Integer getStfNumber(){
        return this.stfNumber;
    }
    /** 操作员编号 */
    public void setStfNumber(Integer operatorNumber){
        this.stfNumber=operatorNumber;
    }
    /** 报废时间 */
    public Date getScrapDate(){
        return this.scrapDate;
    }
    /** 报废时间 */
    public void setScrapDate(Date scrapDate){
        this.scrapDate=scrapDate;
    }
    /** 说明 */
    public String getInformation(){
        return this.information;
    }
    /** 说明 */
    public void setInformation(String information){
        this.information=information;
    }
}
