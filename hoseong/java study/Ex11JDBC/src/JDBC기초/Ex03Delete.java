package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

	public static void main(String[] args) {

		// 회원탈퇴 성공 > 출력 > 일치하는 행 찾아서 삭제
		// 회원탈퇴 실패 > 출력
		Scanner sc = new Scanner(System.in);

		System.out.print("아이디 삭제를 위한 ID를 입력하세요 : ");
		String id = sc.next();
		System.out.print("아이디 삭제를 위한 PW를 입력하세요 : ");
		String pw = sc.next();

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String passward = "hr";

			conn = DriverManager.getConnection(url, user, passward);


			String sql = "DELETE FROM DATADESIGNMEMBER WHERE id = ? AND pw = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);

			int row = ps.executeUpdate();

			if (row > 0) {
				System.out.println("회원탈퇴가 정상적으로 처리되었습니다.");
			} else {
				System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
