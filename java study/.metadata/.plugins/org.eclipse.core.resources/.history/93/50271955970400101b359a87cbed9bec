package Controller;

import Model.Member_DAO;
import Model.Member_DTO;

public class Controller {
	int result = 0;
	Member_DAO dao = new Member_DAO();
	Member_DTO dto = new Member_DTO();

	// 경비원과 결투를 벌인다
	public int Con_fight() { // 결투를 시작한다
		System.out.println("야생의 경비원이 나타났다");
		result = dao.fight();
		
		
		if (dao.fight() > 0) {
			System.out.println("결투에서 승리했습니다! 점수"+dao.fight()+"획득!");
//			dao.scoreupdate();
		}
		if (dao.fight() <= 0) {
			System.out.println("패배하였습니다. GAME OVER");
		}
		return result;
	}

}
