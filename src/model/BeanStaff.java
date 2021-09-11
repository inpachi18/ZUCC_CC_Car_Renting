package model;

public class BeanStaff {
    private Integer number ;
    /** 员工姓名 */
    private String name ;
    /** 登陆密码 */
    private String password ;
    /** 所属网点 */
    private Integer branch ;

    public static final String[] tableTitles={"员工编号","员工姓名","员工密码","所属网点"};

    /** 员工编号 */
    public Integer getNumber(){
        return this.number;
    }
    /** 员工编号 */
    public void setNumber(Integer number){
        this.number=number;
    }
    /** 员工姓名 */
    public String getName(){
        return this.name;
    }
    /** 员工姓名 */
    public void setName(String name){
        this.name=name;
    }
    /** 登陆密码 */
    public String getPassword(){
        return this.password;
    }
    /** 登陆密码 */
    public void setPassword(String password){
        this.password=password;
    }
    /** 所属网点 */
    public Integer getBranch(){
        return this.branch;
    }
    /** 所属网点 */
    public void setBranch(Integer branch){
        this.branch=branch;
    }

    public String getCell(int col){
        if (col==0) return String.valueOf(number);
        else if (col==1) return name;
        else if (col==2) return password;
        else if (col==3) return String.valueOf(branch);
        else return "";
    }
}
