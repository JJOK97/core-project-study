package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO {
	// [DAO]
	// > Database Access Object 데이터베이스에 접근하기 위한 객체

	Connection conn = null; // DB 연결
	PreparedStatement prst = null; // sql 구문 세팅/ 실행
	int result = 0; // return되는 int 형태의 결과 저장
	ResultSet rs = null; // return되는 테이블 형태의 결과를 저장

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
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
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
		} finally {
			close();
		}
		return result;
	}

	public ArrayList<MemberDTO> List() {
		ArrayList<MemberDTO> resultList = new ArrayList<>();
		getConn();

		// 쿼리 준비 > 샘플 쿼리 장착 > (?인자 채우기) > 실행 메소드
		String sql = "Select ID,NAME,AGE From DATADESIGNMEMBER";
		try {
			prst = conn.prepareStatement(sql);
			rs = prst.executeQuery();

//			ResultSet 형태의 결과물을
//			ArrayList<MemberDTO> 타입 데이터로 변환
			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				resultList.add(new MemberDTO(id, name, age));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return resultList;

	}

	public int Update(MemberDTO dto) {
		getConn();
		String sql = "update DATADESIGNMEMBER set name = ? where id = ? and pw = ?";
		try {
			prst = conn.prepareStatement(sql);
			prst.setString(1, dto.getName());
			prst.setString(2, dto.getId());
			prst.setString(3, dto.getPw());
			result = prst.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return result;
	}

	public int delete(MemberDTO dto) {
		getConn();
		String sql = "delete from DATADESIGNMEMBER where id = ? and pw = ?";
		try {
			prst = conn.prepareStatement(sql);
			prst.setString(1, dto.getId());
			prst.setString(2, dto.getPw());
			result = prst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return result;
	}
}
