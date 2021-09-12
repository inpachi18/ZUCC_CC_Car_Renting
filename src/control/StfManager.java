package control;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;

import model.BeanStaff;
import util.BaseException;
import util.BusinessException;
import util.DBUtil;
import util.DbException;

public class StfManager {
    public static BeanStaff currentStf = null;

    public void AddStf(String name, String pwd, int branch) throws BaseException {
        int flag = 0;
        if (StfManager.currentStf.getBranch() != 0)
            throw new BusinessException("需要管理员权限");
        Connection conn = null;
        if ("".equals(name) || name == null) {
            throw new BusinessException("员工名不可为空");
        }
        if ("".equals(pwd) || pwd == null) {
            throw new BusinessException("密码不可为空");
        }
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from Staff";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            if (!rs.next()) {
                pst.close();
                sql = "insert into Staff values(1,?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, pwd);
                pst.setInt(3, branch);
                pst.execute();
                flag = 1;
            }
            rs.close();
            pst.close();

            if (flag == 0) {
                sql = "select *from Staff where Name = ?";
                pst = conn.prepareStatement(sql);
                pst.setString(1, name);
                rs = pst.executeQuery();
                if (rs.next())
                    throw new BusinessException("已存在该员工");
                rs.close();
                pst.close();

                sql = "insert into Staff(Name,Password,Branch) values(?,?,?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, pwd);
                pst.setInt(3, branch);
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

    public List<BeanStaff> loadAll() throws BaseException {
        List<BeanStaff> result = new ArrayList<BeanStaff>();
        Connection conn = null;
        if (StfManager.currentStf.getBranch() != 0)
            throw new BusinessException("需要管理员权限");
        try {
            conn = DBUtil.getConnection();
            String sql = "select * from Staff ";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                BeanStaff p = new BeanStaff();
                p.setNumber(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setPassword(rs.getString(3));
                p.setBranch(rs.getInt(4));
                result.add(p);
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

    public BeanStaff login(String name, String pwd) throws BaseException {
        Connection conn = null;
        BeanStaff g = new BeanStaff();
        try {
            conn = DBUtil.getConnection();
            String sql = "select Password,Number,Branch from Staff where Name=?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            java.sql.ResultSet rs = pst.executeQuery();
            if (!rs.next())
                throw new BusinessException("请输入正确的员工名");
            if (!rs.getString(1).equals(pwd))
                throw new BusinessException("密码错误");
            g.setNumber(rs.getInt(2));
            g.setName(name);
            g.setPassword(pwd);
            g.setBranch(rs.getInt(3));
            rs.close();
            pst.close();
            return g;
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

    public void changePwd(String name, String oldPwd, String newPwd, String newPwd2) throws BaseException {
        if (oldPwd == null)
            throw new BusinessException("密码错误");
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select Password from Staff where Name=?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            java.sql.ResultSet rs = pst.executeQuery();
            if (!rs.next())
                throw new BusinessException("请输入正确的员工名");
            if (!oldPwd.equals(rs.getString(1)))
                throw new BusinessException("原密码错误");
            if (!newPwd.equals(newPwd2))
                throw new BusinessException("两次输入不一致");
            rs.close();
            pst.close();
            sql = "update Staff set Password where Name=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, newPwd);
            pst.setString(2, name);
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

    public void ChangeBranch(String name, String pwd, int branch) throws BaseException {
        if (StfManager.currentStf.getBranch() != 0)
            throw new BusinessException("需要管理员权限");
        Connection conn = null;
        try {
            conn = DBUtil.getConnection();
            String sql = "select Password from Staff where Name = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            java.sql.ResultSet rs = pst.executeQuery();
            if (!rs.next())
                throw new BusinessException("请输入正确的用户名");
            if (!pwd.equals(rs.getString(1)))
                throw new BusinessException("请输入正确的密码");
            rs.close();
            pst.close();
            if ("".equals(branch))
                throw new BusinessException("请输入正确的网点编号，0为管理员");
            sql = "update Staff set Branch = ? where Name=?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, branch);
            pst.setString(2, name);
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbException(e);
        } finally {
            if (conn != null)
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }

    public void DeleteStf(BeanStaff g) throws BaseException {
        Connection conn = null;
        try {
            if (StfManager.currentStf.getBranch() != 0)
                throw new BusinessException("需要管理员权限");
            conn = DBUtil.getConnection();
            String sql = "select * from Car_Scrap where Staff_Number = ?";
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, g.getNumber());
            java.sql.ResultSet rs = pst.executeQuery();
            if (rs.next())
                throw new BusinessException("存在操作记录，无法删除");
            rs.close();
            pst.close();
            sql = "delete from Staff where Number = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, g.getNumber());
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

    public static void main(String[] args) {
        StfManager StfM = new StfManager();
        try {
            StfM.AddStf("Admin", "Admin", 0);
        } catch (BaseException e) {
            e.printStackTrace();
        }
    }
}