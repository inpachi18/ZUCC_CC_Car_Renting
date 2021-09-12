package control;

import model.BeanCar;
import model.BeanCarScrap;
import util.BaseException;
import util.BusinessException;
import util.DBUtil;
import util.DbException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarScrapManager {
    public List<BeanCarScrap> loadAll() throws BaseException {
        List<BeanCarScrap> result = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from Car_Scrap";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                BeanCarScrap c = new BeanCarScrap();
                c.setScrapNumber(rs.getInt(1));
                c.setCarNumber(rs.getInt(2));
                c.setStfNumber(rs.getInt(3));
                c.setScrapDate(rs.getDate(4));
                c.setInformation(rs.getString(5));
                result.add(c);
            }
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbException(e);
        } finally {
            if (conn != null)
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }
    public void createScrap(Integer car_id,String info) throws BaseException{
        Connection conn = null;
        try {
            conn=DBUtil.getConnection();
            String sql="select State,Branch from Car_Information where Number=?";
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1,car_id);
            java.sql.ResultSet rs=pst.executeQuery();
            rs.next();
            if (rs.getInt(2)!=StfManager.currentStf.getBranch() && StfManager.currentStf.getBranch()!=0)
                throw new BusinessException("无法报废不属于自己网点的车辆");
            if (!"空闲".equals(rs.getString(1)))
                throw new BusinessException("车辆被占用中，无法报废");
            rs.close();
            pst.close();

            sql="insert into Car_Scrap(Car_Number,Stf_Number,Scrap_Date,Information) values(?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setInt(1,car_id);
            pst.setInt(2,StfManager.currentStf.getNumber());
            pst.setDate(3,new java.sql.Date(System.currentTimeMillis()));
            pst.setString(4,info);
            pst.execute();
            pst.close();
            sql="update Car_Information set State='报废' where Number=?";
            pst=conn.prepareStatement(sql);
            pst.setInt(1,car_id);
            pst.execute();
            pst.close();

        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbException(e);
        } finally {
            if (conn != null)
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }

        }
    }
}
