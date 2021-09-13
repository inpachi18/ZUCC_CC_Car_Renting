package control;

import model.BeanCar;
import util.BaseException;
import util.BusinessException;
import util.DBUtil;
import util.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarManager {

    public List<BeanCar> loadAll() throws BaseException {
        List<BeanCar> result = new ArrayList<>();
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from Car_Information";
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                BeanCar c = new BeanCar();
                c.setNumber(rs.getInt(1));
                c.setNumberplate(rs.getString(2));
                c.setModel(rs.getInt(3));
                c.setBranch(rs.getInt(4));
                c.setState(rs.getString(5));
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

    public List<BeanCar> loadAlltoScrap() throws BaseException {
        Connection conn = null;
        List<BeanCar> result = new ArrayList<>();
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from Car_Information where State='空闲' and Number not in (select Car_Number from Car_Scrap)";
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                BeanCar c = new BeanCar();
                c.setNumber(rs.getInt(1));
                c.setNumberplate(rs.getString(2));
                c.setModel(rs.getInt(3));
                c.setBranch(rs.getInt(4));
                c.setState(rs.getString(5));
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

    public void AddCar(String plate, Integer type, Integer branch, String state) throws BaseException {
        int flag = 0;
        Connection conn = null;
        if ("".equals(plate) || "".equals(state) || type == -1 || branch == -1)
            throw new BusinessException("输入不可为空");
        if (!"空闲".equals(state) && !"使用中".equals(state) && !"已报废".equals(state))
            throw new BusinessException("输入正确的状态");
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from Car_Information";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            if (!rs.next()) {
                pst.close();
                sql = "insert into Car_Information values(1,?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(2, plate);
                pst.setInt(3, type);
                pst.setInt(4, branch);
                pst.setString(5, state);
                pst.execute();
                flag = 1;
            }
            rs.close();
            pst.close();
            if (flag == 0) {
                sql = "select * from Car_Information where NumberPlate=?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, state);
                rs = pst.executeQuery();
                if (rs.next())
                    throw new BusinessException("车辆已存在");
                rs.close();
                pst.close();

                sql = "insert into Car_Information(NumberPlate,Type,Branch,State) values(?,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, plate);
                pst.setInt(2, type);
                pst.setInt(3, branch);
                pst.setString(4, state);
                pst.execute();
                pst.close();
            }
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

    public static BeanCar SearchInfo(String plate) throws BaseException {
        Connection conn = null;
        BeanCar result =new BeanCar();
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from Car_Information where NumberPlate=?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, plate);
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                if (rs.getString(2) == null || "".equals(rs.getString(2)))
                    throw new BusinessException("请输入正确的车牌号！");
                BeanCar p = new BeanCar();
                p.setNumber(rs.getInt(1));
                p.setNumberplate(rs.getString(2));
                p.setModel(rs.getInt(3));
                p.setBranch(rs.getInt(4));
                p.setState(rs.getString(5));
                result = p;
            }
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
        return result;
    }

    public void ChangeInfo(String plate, Integer type, Integer branch, String state) throws BaseException {
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            BeanCar o = this.SearchInfo(plate);
            if (type == -1) type = o.getModel();
            if (branch == -1) branch = o.getBranch();
            if (state == null) state = o.getState();
            String sql = "update Car_Information set Type=?,Branch=?,State=?, where NumberPlate=?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, type);
            pst.setInt(2, branch);
            pst.setString(3, state);
            pst.setString(4, plate);
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