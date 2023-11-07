//package jdbc_ex;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import jdbc_ex.common.JDBCUtil;
//
//public class SelectTest {
//	public static void main(String[] args) {
//		String sql = "select * from users";
//		try (Connection conn = JDBCUtil.getConnect();
//				Statement stmt = conn.createStatement();
//				ResultSet rs = stmt.executeQuery(sql)) {
//			while (rs.next()) {
//				System.out.println(rs.getString("name"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//}
