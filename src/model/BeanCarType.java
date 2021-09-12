package model;

public class BeanCarType {
    /** 类别编号 **/
    private Integer number ;
    /** 类别名称 */
    private String name ;
    /** 类别描述 */
    private String information ;

    public static final String[] tableTitles={"类别编号","类别名称","类别描述"};

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
