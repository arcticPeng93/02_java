package jdbc_ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc_ex.common.JDBCUtil;

public class InsertUserTest {
	public static void main(String[] args) {
		// role)뒤에 반드시 띄어쓰기 해 주어야 함!!
		String sql = "insert into users(id, password, name, role) " + "values(?, ?, ?, ?)";
		try (Connection conn = JDBCUtil.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, "ssamz2");
			pstmt.setString(2, "ssamz123");
			pstmt.setString(3, "쌤즈");
			pstmt.setString(4, "ADMIN");
			int count = pstmt.executeUpdate();
			System.out.println(count + "건 데이터 처리 성공!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
