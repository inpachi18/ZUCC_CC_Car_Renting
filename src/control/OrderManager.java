package control;

import util.BaseException;
import util.BusinessException;
import util.DBUtil;
import util.DbException;

import java.sql.Connection;
import java.sql.SQLException;

public class OrderManager {
    public void CreateOrder(Integer user_id, Integer car_id, Integer branch1) throws BaseException {
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select State,Branch from Car_Information where Number=?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, car_id);
            java.sql.ResultSet rs = pst.executeQuery();
            rs.next();
            if (rs.getInt(2) != branch1)
                throw new BusinessException("提车网点与车辆实际网点不符");
            if (!"空闲".equals(rs.getString(1)))
                throw new BusinessException("车辆被占用中，无法下订单");
            rs.close();
            pst.close();

            sql = "select Order_Number from OrderInfo where User_Number=? and Order_State='进行中'";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, car_id);
            rs = pst.executeQuery();
            if (rs.next())
                throw new BusinessException("同时只能有一个进行中订单");
            rs.close();
            pst.close();

            sql = "insert into OrderInfo(User_Number,Car_Number,Hire_Branch,Hire_Date,Order_State) values(?,?,?,?,'进行中')";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, user_id);
            pst.setInt(2, car_id);
            pst.setInt(3, branch1);
            pst.setDate(4, new java.sql.Date(System.currentTimeMillis()));
            pst.execute();
            pst.close();
            sql = "update Car_Information set State='使用中' where Number=?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, car_id);
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
    public void finishOrder(Integer user_id,Integer branch2) throws BaseException{
        Connection conn=null;
        try {
            conn=DBUtil.getConnection();
            String sql = "update OrderInfo set Order_Number=?, Return_Branch=?,Return_Date=?,Final_Price=?,,Order_State='已结束' where User_Number=? and Order_State='进行中'";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);

        }  catch (SQLException e) {
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
