package jdbc_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		Connection conn = null;
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
			System.out.println("DB 연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
					conn = null;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
