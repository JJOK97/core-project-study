package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExDama {

	public static void main(String[] args) {

		// 입력도구
		Scanner sc = new Scanner(System.in);

		// 도구 꺼내기
		Connection conn = null;
		PreparedStatement prst = null;
		ResultSet rs = null;

		try {// DB드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// DB연결에 필요한 설정값
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String passward = "hr";
		try {
			while (true) {
				System.out.println("메뉴 [1]다마고치 생성 [2]다마고치 키우기");
				int select = sc.nextInt();

				if (select == 1) { // 다마고치 생성
					// 이름 생성
					System.out.println("다마고치 이름과 다마고치가 좋아하는 음식을 입력하세요");
					String name = sc.next();
					String food = sc.next();
					try {
						// 작업할때마다 새로운 커넥션을 생성
						conn = DriverManager.getConnection(url, user, passward);
						// 배고픔, 졸림은 각 30으로
						String sql = "insert into DAMA values (?,?,30,30)";
						prst = conn.prepareStatement(sql);
						prst.setString(1, name);
						prst.setString(2, food);

						int row = prst.executeUpdate();

						if (row > 0) {
							System.out.println("다마고치 생성 완료");
						} else {
							System.out.println("다마고치 생성 실패");
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}

				} else if (select == 2) { // 키우기
					System.out.println("메뉴 [1]상태확인 [2]밥주기 [3]재우기");
					int select2 = sc.nextInt();

					if (select2 == 1) {// 상태확인 선택
						// 내가 만든 모든 다마고치의 상태를 볼 수 있는 로직
						try {
							conn = DriverManager.getConnection(url, user, passward);

							String sql = "select * from DAMA";
							prst = conn.prepareStatement(sql);
							rs = prst.executeQuery();
							while (rs.next()) {
								String name = rs.getString("name");
								String food = rs.getString("food");
								int hungry = rs.getInt("hungry");
								int sleepy = rs.getInt("sleepy");

								System.out.println("==== 다마고치 상태 확인 ====");
								System.out.println(name + "\t" + food + "\t" + hungry + "\t" + sleepy);
							}
						} catch (SQLException e) {
							e.printStackTrace();
						}

					} else if (select2 == 2) {// 밥주기 선택
						System.out.print("밥을 먹일 다마고치의 이름을 입력하세요");
						String name = sc.next();
						System.out.print(name + "에게 먹일 음식을 입력하세요");
						String food = sc.next();
						try {
							conn = DriverManager.getConnection(url, user, passward);
							String sql = "update DAMA set hungry = hungry -5 where name = ?";

							prst = conn.prepareStatement(sql);
							prst.setString(1, name);
							
							int result = prst.executeUpdate();
							
							if (result>0) {
								System.out.println(name+"에게 "+food+"를 주었습니다");
							}else {
								System.out.println("잘못된 입력입니다.");
							}

						} catch (SQLException e) {
							e.printStackTrace();
						}

					} else if (select2 == 3) {// 재우기 선택
						try {
							System.out.print("잠을 제울 다마고치의 이름을 입력하세요");
							String name = sc.next();
							conn = DriverManager.getConnection(url, user, passward);
							String sql = "update DAMA set sleepy = sleepy -5 where name = ?";
							prst = conn.prepareStatement(sql);
							prst.setString(1, name);
							int result = prst.executeUpdate();
							if (result>0) {
								System.out.println(name+"을 재웠습니다");
							}else {
								System.out.println("잘못된 입력입니다.");
							}
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
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
	}

}
