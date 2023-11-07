package org.galapagos.jelly.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	static Connection conn = null;

	static {
		try {
			// 오라클 JDBC
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			String url = "jdbc:oracle:thin:@localhost:1521:xe";
//			String id = "jdbc_ex";
//			String password = "jdbc_ex";

			// MySQL JDBC
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/glory_db";
			String id = "glory";
			String password = "1234";
			conn = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return conn;
	}

	public static void close() {
		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
