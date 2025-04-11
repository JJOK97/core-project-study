package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MemberDAO {
	// [DAO]
	// > Database Access Object 데이터베이스에 접근하기 위한 객체
	
	Connection conn = null;
	PreparedStatement prst = null;
	int result = 0; //결과 저장
	
	public void getConn() { // DB에 접속 메소드
		try {// DB드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// DB연결에 필요한 설정값
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passward = "hr";
		conn = DriverManager.getConnection(url, user, passward);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void close() {// 객체 반납 메소드
		try {
			if (prst != null) {
				prst.close();
			}
			if (conn!=null) {
				conn.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public int join(MemberDTO dto) { // 회원가입 쿼리 메소드
		// DB접근
		getConn();
		// DB쿼리문실행
		String sql = "insert into DATADESIGNMEMBER VALUES (?,?,?,?,0)";
		try {
			prst = conn.prepareStatement(sql);
			prst.setString(1, dto.getId());
			prst.setString(2, dto.getPw());
			prst.setString(3, dto.getName());
			prst.setInt(4, dto.getAge());
			result = prst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return result;
	}
}
