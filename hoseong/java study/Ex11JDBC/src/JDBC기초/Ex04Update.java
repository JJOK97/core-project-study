package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04Update {

	public static void main(String[] args) {

		// id, pw, 수정할 점수
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원정보 수정 =====");
		System.out.print("ID 입력 : ");
		String id=sc.next();
		System.out.print("PW 입력 : ");
		String pw=sc.next();
		System.out.println("수정할 점수 입력 : ");
		int score = sc.nextInt();
		
		Connection conn = null;
		PreparedStatement ps = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String passward = "hr";

			conn = DriverManager.getConnection(url, user, passward);


			String sql = "update DATADESIGNMEMBER set score = ? where id = ? and pw = ?";
			
			ps = conn.prepareStatement(sql);
			ps.setString(2, id);
			ps.setString(3, pw);
			ps.setInt(1, score);

			int row = ps.executeUpdate();

			if (row > 0) {
				System.out.println("회원정보가 변경되었습니다.");
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
