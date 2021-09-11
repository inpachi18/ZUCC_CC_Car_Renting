package model;

public class BeanCarModel {
    /** 车型编号 */
    private Integer number ;
    /** 车型名称 */
    private String name ;
    /** 品牌 */
    private String brand ;
    /** 排量 */
    private String displacement ;
    /** 排挡 */
    private String gears ;
    /** 座位数 */
    private Integer seats ;
    /** 价格 */
    private Double price ;
    /** 图片（链接） */
    private String picture ;
    /** 所属类别 */
    private Integer type ;

    /** 车型编号 */
    public Integer getNumber(){
        return this.number;
    }
    /** 车型编号 */
    public void setNumber(Integer number){
        this.number=number;
    }
    /** 车型名称 */
    public String getName(){
        return this.name;
    }
    /** 车型名称 */
    public void setName(String name){
        this.name=name;
    }
    /** 品牌 */
    public String getBrand(){
        return this.brand;
    }
    /** 品牌 */
    public void setBrand(String brand){
        this.brand=brand;
    }
    /** 排量 */
    public String getDisplacement(){
        return this.displacement;
    }
    /** 排量 */
    public void setDisplacement(String displacement){
        this.displacement=displacement;
    }
    /** 排挡 */
    public String getGears(){
        return this.gears;
    }
    /** 排挡 */
    public void setGears(String gears){
        this.gears=gears;
    }
    /** 座位数 */
    public Integer getSeats(){
        return this.seats;
    }
    /** 座位数 */
    public void setSeats(Integer seats){
        this.seats=seats;
    }
    /** 价格 */
    public Double getPrice(){
        return this.price;
    }
    /** 价格 */
    public void setPrice(Double price){
        this.price=price;
    }
    /** 图片（链接） */
    public String getPicture(){
        return this.picture;
    }
    /** 图片（链接） */
    public void setPicture(String picture){
        this.picture=picture;
    }
    /** 所属类别 */
    public Integer getType(){
        return this.type;
    }
    /** 所属类别 */
    public void setType(Integer type){
        this.type=type;
    }
}
