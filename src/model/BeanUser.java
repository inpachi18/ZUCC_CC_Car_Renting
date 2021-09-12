package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BeanUser {
    private Integer number ;
    /** 姓名 */
    private String name ;
    /** 性别 */
    private String sex ;
    /** 密码 */
    private String password ;
    /** 手机号码 */
    private String telephone ;
    /** 邮箱 */
    private String email ;
    /** 所在城市 */
    private String city ;
    /** 注册时间 */
    private Date registerdate ;

    public static final String[] tabletitles={"用户编号","用户姓名","用户性别","用户密码","用户电话","用户邮箱","用户城市","注册时间"};

    /** 用户编号 */
    public Integer getNumber(){
        return this.number;
    }
    /** 用户编号 */
    public void setNumber(Integer number){
        this.number=number;
    }
    /** 姓名 */
    public String getName(){
        return this.name;
    }
    /** 姓名 */
    public void setName(String name){
        this.name=name;
    }
    /** 性别 */
    public String getSex(){
        return this.sex;
    }
    /** 性别 */
    public void setSex(String sex){
        this.sex=sex;
    }
    /** 密码 */
    public String getPassword(){
        return this.password;
    }
    /** 密码 */
    public void setPassword(String password){
        this.password=password;
    }
    /** 手机号码 */
    public String getTelephone(){
        return this.telephone;
    }
    /** 手机号码 */
    public void setTelephone(String telephone){
        this.telephone=telephone;
    }
    /** 邮箱 */
    public String getEmail(){
        return this.email;
    }
    /** 邮箱 */
    public void setEmail(String email){
        this.email=email;
    }
    /** 所在城市 */
    public String getCity(){
        return this.city;
    }
    /** 所在城市 */
    public void setCity(String city){
        this.city=city;
    }
    /** 注册时间 */
    public Date getRegisterdate(){
        return this.registerdate;
    }
    /** 注册时间 */
    public void setRegisterdate(Date registerdate){
        this.registerdate=registerdate;
    }

    public String getCell(int col){
		if(col==0) return String.valueOf(number);
		else if(col==1) return name;
		else if(col==2) return sex;
		else if(col==3) return password;
		else if(col==4) return telephone;
		else if(col==5) return email;
		else if(col==6) return city;
		else if(col==7) {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
			return format.format(registerdate); 
		}
		else return "";
	}
}
