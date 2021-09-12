DROP TABLE IF EXISTS Car_Type;
CREATE TABLE Car_Type(
    Number int    COMMENT '类别编号' ,
    Name varchar(60)    COMMENT '类别名称' ,
    Information varchar(1024)    COMMENT '类别描述' ,
    PRIMARY KEY (Number)
)  COMMENT = '汽车类别';


CREATE INDEX Identifier_1 ON Car_Type(Number);

DROP TABLE IF EXISTS Car_Model;
CREATE TABLE Car_Model(
    Number int    COMMENT '车型编号' ,
    Name varchar(60)    COMMENT '车型名称' ,
    Brand varchar(60)    COMMENT '品牌' ,
    Displacement varchar(60)    COMMENT '排量' ,
    Gears varchar(60)    COMMENT '排挡' ,
    Seats int    COMMENT '座位数' ,
    Price float    COMMENT '价格' ,
    Picture varchar(1024)    COMMENT '图片（链接）' ,
    Type int    COMMENT '所属类别' ,
    PRIMARY KEY (Number)
)  COMMENT = '车型信息';


CREATE INDEX Identifier_1 ON Car_Model(Number);

DROP TABLE IF EXISTS Branch;
CREATE TABLE Branch(
    Number INT    COMMENT '网点编号' ,
    Name VARCHAR(60)    COMMENT '网点名称' ,
    City VARCHAR(60)    COMMENT '所属城市' ,
    Address VARCHAR(60)    COMMENT '地址' ,
    Telephone VARCHAR(60)    COMMENT '联系电话' ,
    PRIMARY KEY (Number)
)  COMMENT = '网点信息';


CREATE INDEX Identifier_1 ON Branch(Number);

DROP TABLE IF EXISTS Coupon;
CREATE TABLE Coupon(
    Number INT    COMMENT '优惠券编号' ,
    Information VARCHAR(60)    COMMENT '内容' ,
    Discount DECIMAL(24,6)    COMMENT '减免金额' ,
    StartDate DATETIME    COMMENT '起始日期' ,
    FinishDate DATETIME    COMMENT '结束日期' ,
    PRIMARY KEY (Number)
)  COMMENT = '优惠券';


CREATE INDEX Identifier_1 ON Coupon(Number);

DROP TABLE IF EXISTS FlashSale;
CREATE TABLE FlashSale(
    Sale_Number INT    COMMENT '促销编号' ,
    Branch_Number INT    COMMENT '网点编号' ,
    Car_Model INT    COMMENT '车辆型号' ,
    Sale_Discount DECIMAL(24,6)    COMMENT '促销折扣' ,
    Sale_Count INT    COMMENT '促销数量' ,
    Start_Date DATETIME    COMMENT '起始日期' ,
    Finish_Date DATETIME    COMMENT '结束日期' ,
    PRIMARY KEY (Sale_Number)
)  COMMENT = '限时促销信息';


CREATE INDEX Identifier_1 ON FlashSale(Sale_Number);

DROP TABLE IF EXISTS UserData;
CREATE TABLE UserData(
    Number int    COMMENT '用户编号' ,
    Name varchar(60)    COMMENT '姓名' ,
    Sex varchar(60)    COMMENT '性别' ,
    Password varchar(60)    COMMENT '密码' ,
    Telephone varchar(60)    COMMENT '手机号码' ,
    Email varchar(60)    COMMENT '邮箱' ,
    City varchar(60)    COMMENT '所在城市' ,
    RegisterDate date    COMMENT '注册时间' ,
    PRIMARY KEY (Number)
)  COMMENT = '用户信息';


CREATE INDEX Identifier_1 ON UserData(Number);

DROP TABLE IF EXISTS Order;
CREATE TABLE Order(
    Order_Number INT    COMMENT '订单编号' ,
    User_Number INT    COMMENT '用户编号' ,
    Hire_Branch INT    COMMENT '提车网点' ,
    Return_Branch INT    COMMENT '还车网点' ,
    Hire_Date DATETIME    COMMENT '提车时间' ,
    Return_Date DATETIME    COMMENT '还车时间' ,
    Hire_Time INT    COMMENT '租车时长' ,
    Original_Price DECIMAL(24,6)    COMMENT '原始金额' ,
    Final_Price DECIMAL(24,6)    COMMENT '结算金额' ,
    Coupon_Number INT    COMMENT '优惠券编号' ,
    Order_State VARCHAR(60)    COMMENT '订单状态' ,
    PRIMARY KEY (Order_Number)
)  COMMENT = '商品订单';


CREATE INDEX Identifier_1 ON Order(Order_Number);

DROP TABLE IF EXISTS Car_Scrap;
CREATE TABLE Car_Scrap(
    Scrap_Number INT    COMMENT '报废编号' ,
    Car_Number INT    COMMENT '车辆编号' ,
    Staff_Number INT    COMMENT '操作员编号' ,
    Scrap_Date DATETIME    COMMENT '报废时间' ,
    Information VARCHAR(60)    COMMENT '说明' ,
    PRIMARY KEY (Scrap_Number)
)  COMMENT = '车辆报废表';


CREATE INDEX Identifier_1 ON Car_Scrap(Scrap_Number);

DROP TABLE IF EXISTS Staff;
CREATE TABLE Staff(
    Number int    COMMENT '员工编号' ,
    Name varchar(60)    COMMENT '员工姓名' ,
    Password varchar(60)    COMMENT '登陆密码' ,
    Branch int    COMMENT '所属网点' ,
    PRIMARY KEY (Number)
)  COMMENT = '员工信息表';


CREATE INDEX Identifier_1 ON Staff(Number);

DROP TABLE IF EXISTS Car_Informatin;
CREATE TABLE Car_Informatin(
    Number INT    COMMENT '车辆编号' ,
    Branch_Number INT    COMMENT '网点编号' ,
    NumberPlate VARCHAR(60)    COMMENT '车牌号' ,
    Type INT    COMMENT '所属车型' ,
    Branch INT    COMMENT '所在网点' ,
    State VARCHAR(60)    COMMENT '当前状态' ,
    PRIMARY KEY (Number)
)  COMMENT = '车辆信息';


CREATE INDEX Identifier_1 ON Car_Informatin(Number);

