package control;

import model.BeanCouponReceived;
import util.BaseException;
import util.BusinessException;
import util.DBUtil;
import util.DbException;
import model.BeanCoupon;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CouponManager {

	public List<BeanCoupon> loadAllCoupon() throws BaseException {
		List<BeanCoupon> list_coupon = new ArrayList<BeanCoupon>();
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select * from coupon";
			java.sql.Statement st = conn.createStatement();
			java.sql.ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				BeanCoupon c = new BeanCoupon();
				c.setCoupon_id(rs.getInt(1));
				c.setLocation_id(rs.getInt(2));
				c.setContent(rs.getString(3));
				c.setDiscount_amount(rs.getFloat(4));
				c.setStart_date(rs.getTimestamp(5));
				c.setEnd_date(rs.getTimestamp(6));
				list_coupon.add(c);
			}
			return list_coupon;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	public void createCoupon(BeanCoupon coupon) throws BaseException {
		if (coupon.getStart_date() == null)
			throw new BusinessException("请输入起始日期");
		if (coupon.getEnd_date() == null)
			throw new BusinessException("请输入结束日期");
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select count(*) from coupon";
			java.sql.Statement st = conn.createStatement();
			java.sql.ResultSet rs = st.executeQuery(sql);
			rs.next();
			int total_count = 0;
			if (rs.getInt(1) == 0) {
				total_count = 1;
			} else {
				total_count = rs.getInt(1) + 1;
			}
			rs.close();
			st.close();

			sql = "insert into coupon values (?,?,?,?,?,?,'未过期')";
			java.sql.PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, total_count);
			pst.setInt(2, coupon.getLocation_id());
			pst.setString(3, coupon.getContent());
			pst.setFloat(4, coupon.getDiscount_amount());
			pst.setTimestamp(5, new java.sql.Timestamp(coupon.getStart_date().getTime()));
			pst.setTimestamp(6, new java.sql.Timestamp(coupon.getEnd_date().getTime()));
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	public boolean canModify(String coupon_id) throws BaseException{
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			boolean b=true; 
			String sql = "select * from coupon_received where status='未使用' "
					+ "and coupon_id="+coupon_id;
			java.sql.Statement st = conn.createStatement();
			java.sql.ResultSet rs = st.executeQuery(sql);
			if (rs.next()) {
				b=false;
			}
			rs.close();
			st.close();
			return b;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	public void modifyCoupon(BeanCoupon coupon) throws BaseException {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "update coupon set location_id=?,content=?,discount_amount=?,"
					+ "start_date=?,end_date=? where coupon_id=?";
			java.sql.PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, coupon.getLocation_id());
			pst.setString(2, coupon.getContent());
			pst.setFloat(3, coupon.getDiscount_amount());
			pst.setTimestamp(4, new java.sql.Timestamp(coupon.getStart_date().getTime()));
			pst.setTimestamp(5, new java.sql.Timestamp(coupon.getEnd_date().getTime()));
			pst.setInt(6, coupon.getCoupon_id());
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	//优惠券领取栏
	public List<BeanCoupon> loadUnclaimedCoupon(String user_id) throws BaseException {
		List<BeanCoupon> list_coupon = new ArrayList<BeanCoupon>();
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			
			String sql = "update coupon set status='未过期' where status=''";
			java.sql.Statement st = conn.createStatement();
			st.execute(sql);
			st.close();
			
			sql = "select * from coupon where status='未过期'";
			st = conn.createStatement();
			java.sql.ResultSet rs = st.executeQuery(sql);
			
			List<Integer> overdue_id = new ArrayList<>();
			Date current_time = new Date();
			while (rs.next()) {
				//判断优惠券是否过期
				if (current_time.getTime()<rs.getTimestamp(5).getTime() || current_time.getTime()>rs.getTimestamp(6).getTime()) {
					overdue_id.add(rs.getInt(1));
				}
			}
			rs.close();
			st.close();
			
			//有过期优惠券时更新状态
			if (overdue_id.size()>0) {
				sql = "update coupon set status='已过期' where coupon_id in (";
				for (int i=0;i<overdue_id.size();i++) {
					sql+=overdue_id.get(i);
					if (i!=overdue_id.size()-1) {
						sql+=",";
					}
				}
				sql+=")";
				st = conn.createStatement();
				st.execute(sql);
				st.close();
			}
			
			sql = "select * from coupon where coupon_id not in "
					+ "(select coupon_id from coupon_received where user_id=?) order by coupon_id";
			java.sql.PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, user_id);
			rs = pst.executeQuery();
			while (rs.next()) {
				BeanCoupon c = new BeanCoupon();
				c.setCoupon_id(rs.getInt(1));
				c.setLocation_id(rs.getInt(2));
				c.setContent(rs.getString(3));
				c.setDiscount_amount(rs.getFloat(4));
				c.setStart_date(rs.getTimestamp(5));
				c.setEnd_date(rs.getTimestamp(6));
				c.setStatus(rs.getString(7));
				list_coupon.add(c);
			}
			return list_coupon;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	public void getCoupon(BeanCouponReceived coupon_received,String start_date,String end_date) throws BaseException {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			try {
				Date start = simpleDateFormat.parse(start_date);
				Date end = simpleDateFormat.parse(end_date);
				Date current = new Date();
				if (current.getTime()<start.getTime() || current.getTime()>end.getTime())
					throw new BusinessException("该优惠券已过期，无法领取");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String sql = "select count(*) from coupon_received";
			java.sql.Statement st = conn.createStatement();
			java.sql.ResultSet rs = st.executeQuery(sql);
			rs.next();
			int total_count = 0;
			if (rs.getInt(1) == 0) {
				total_count = 1;
			} else {
				total_count = rs.getInt(1) + 1;
			}
			rs.close();
			st.close();

			sql = "insert into coupon_received values(?,?,?,'未使用')";
			java.sql.PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, total_count);
			pst.setString(2, coupon_received.getUser_id());
			pst.setInt(3, coupon_received.getCoupon_id());
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

	public List<BeanCoupon> loadReceivedCoupon(String user_id) throws BaseException{
		List<BeanCoupon> list_coupon = new ArrayList<BeanCoupon>();
		Connection conn = null;
		try {
			conn = DBUtil.getConnection();
			String sql = "select * from coupon where coupon_id in "
					+ "(select coupon_id from coupon_received where user_id=?) order by coupon_id";
			java.sql.PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, user_id);
			java.sql.ResultSet rs = pst.executeQuery();
			
			List<Integer> overdue_id = new ArrayList<>();
			Date current_time = new Date();
			while (rs.next()) {
				BeanCoupon c = new BeanCoupon();
				c.setCoupon_id(rs.getInt(1));
				c.setLocation_id(rs.getInt(2));
				c.setContent(rs.getString(3));
				c.setDiscount_amount(rs.getFloat(4));
				c.setStart_date(rs.getTimestamp(5));
				c.setEnd_date(rs.getTimestamp(6));
				list_coupon.add(c);
				//判断优惠券是否过期
				if (current_time.getTime()<rs.getTimestamp(5).getTime() || current_time.getTime()>rs.getTimestamp(6).getTime()) {
					overdue_id.add(rs.getInt(1));
				}
			}
			rs.close();
			pst.close();
			
			if (overdue_id.size()>0) {
				sql = "update coupon_received set status='已过期' where coupon_id in (";
				for (int i=0;i<overdue_id.size();i++) {
					sql+=overdue_id.get(i);
					if (i!=overdue_id.size()-1) {
						sql+=",";
					}
				}
				sql+=")";
				java.sql.Statement st = conn.createStatement();
				st.execute(sql);
				st.close();
			}
			
			sql = "select status from coupon_received where user_id=? order by coupon_id";
			pst= conn.prepareStatement(sql);
			pst.setString(1, user_id);
			rs = pst.executeQuery();
			int i=0;
			while (rs.next()) {
				list_coupon.get(i).setReceived_status(rs.getString(1));
				i++;
			}
			return list_coupon;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
