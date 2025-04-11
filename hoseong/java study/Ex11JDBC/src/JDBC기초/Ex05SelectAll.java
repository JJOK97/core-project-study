package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex05SelectAll {

	public static void main(String[] args) {

		// select * from DATADESIGNMEMBER;
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String passward = "hr";

			conn = DriverManager.getConnection(url, user, passward);

			String sql = "select * from DATADESIGNMEMBER order by score asc";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			// ResultSet
			// : 조회된 데이터 결과를 테이블과 같은 형태로 표현해주는 집합 자료구조
			// > cursor를 가지고 있다(처음에는 column명을 가리키고 있음)
			// : cursor가 가리키고 있는 데이터만 가져올 수 있다.

			// rs.next(); > cursor를 한 행 밑으로 내리기
			System.out.println("아이디\t패스워드\t이름\t나이\t점수");
			while (rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				int score = rs.getInt("score");
				
				System.out.println(id + "\t" + pw + "\t" + name + "\t" + age + "\t" + score);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 열어준 순서의 반대로

			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
