package model;

public class BeanCar {
    /** 车辆编号 */
    private Integer number ;
    /** 车牌号 */
    private String numberplate ;
    /** 所属车型 */
    private Integer Model;
    /** 所在网点 */
    private Integer branch ;
    /** 当前状态 */
    private String state ;

    public static final String[] tableTitles={"车辆编号","车牌号","所属车型","所在网点","当前状态"};

    /** 车辆编号 */
    public Integer getNumber(){
        return this.number;
    }
    /** 车辆编号 */
    public void setNumber(Integer number){
        this.number=number;
    }
    /** 车牌号 */
    public String getNumberplate(){
        return this.numberplate;
    }
    /** 车牌号 */
    public void setNumberplate(String numberplate){
        this.numberplate=numberplate;
    }
    /** 所属车型 */
    public Integer getModel(){
        return this.Model;
    }
    /** 所属车型 */
    public void setModel(Integer model){
        this.Model = model;
    }
    /** 所在网点 */
    public Integer getBranch(){
        return this.branch;
    }
    /** 所在网点 */
    public void setBranch(Integer branch){
        this.branch=branch;
    }
    /** 当前状态 */
    public String getState(){
        return this.state;
    }
    /** 当前状态 */
    public void setState(String state){
        this.state=state;
    }
}
