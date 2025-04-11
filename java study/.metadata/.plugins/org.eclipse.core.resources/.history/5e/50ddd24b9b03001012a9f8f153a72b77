package Controller;

import Model.MemberDAO;
import Model.MemberDTO;

public class Controller {
	// [Controller]
	// 사용자의 요청에 따라서 그에 맞는 DB로직을 실행
	int result = 0;
	// dao = DB연결, 쿼리문 실행 메소드
	MemberDAO dao = new MemberDAO();
	
	
	// View 에게 전달받은 데이터를 Model 에 전달하면서, 기능을 수행하게끔 명령
	public int Con_join(String id, String pw, String name, int age) {
		// 전달해야하는 데이터를 하나의 묶음으로 만들어서 Model 에 보냄(객체 생성)
		MemberDTO dto = new MemberDTO(id,pw,name,age);
		return result = dao.join(dto);
	}
	
}
