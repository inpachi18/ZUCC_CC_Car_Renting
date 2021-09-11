package model;

public class BeanCarType {
    private Integer number ;
    /** 类别名称 */
    private String name ;
    /** 类别描述 */
    private String information ;

    /** 类别编号 */
    public Integer getNumber(){
        return this.number;
    }
    /** 类别编号 */
    public void setNumber(Integer number){
        this.number=number;
    }
    /** 类别名称 */
    public String getName(){
        return this.name;
    }
    /** 类别名称 */
    public void setName(String name){
        this.name=name;
    }
    /** 类别描述 */
    public String getInformation(){
        return this.information;
    }
    /** 类别描述 */
    public void setInformation(String information){
        this.information=information;
    }
}
