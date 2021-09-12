package model;

public class BeanBranch {
    /** 网点编号 */
    private Integer number ;
    /** 网点名称 */
    private String name ;
    /** 所属城市 */
    private String city ;
    /** 地址 */
    private String address ;
    /** 联系电话 */
    private String telephone ;

    public static final String[] tableTitles={"网点编号","网点名称","所属城市","地址","联系电话"};

    /** 网点编号 */
    public Integer getNumber(){
        return this.number;
    }
    /** 网点编号 */
    public void setNumber(Integer number){
        this.number=number;
    }
    /** 网点名称 */
    public String getName(){
        return this.name;
    }
    /** 网点名称 */
    public void setName(String name){
        this.name=name;
    }
    /** 所属城市 */
    public String getCity(){
        return this.city;
    }
    /** 所属城市 */
    public void setCity(String city){
        this.city=city;
    }
    /** 地址 */
    public String getAddress(){
        return this.address;
    }
    /** 地址 */
    public void setAddress(String address){
        this.address=address;
    }
    /** 联系电话 */
    public String getTelephone(){
        return this.telephone;
    }
    /** 联系电话 */
    public void setTelephone(String telephone){
        this.telephone=telephone;
    }
}
