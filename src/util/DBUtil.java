package util;

import java.sql.Connection;

public class DBUtil {
    private static final String jdbcUrl="jdbc:mysql://127.0.0.1:3306/Car";
	private static final String dbUser="root";
	private static final String dbPwd="swjh2000";
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws java.sql.SQLException{
		return java.sql.DriverManager.getConnection(jdbcUrl, dbUser, dbPwd);
	}
}
