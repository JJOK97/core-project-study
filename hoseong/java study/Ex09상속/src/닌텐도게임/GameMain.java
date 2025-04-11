package 닌텐도게임;

public class GameMain {
// 닌텐도 게임기(실행할 수 있는 공간)
	public static void main(String[] args) {

		// 마리오 게임칩 꺼내오기
		Mario m = new Mario();
		// 게임칩 넣기
		on(m);
		// 젤다 게임칩 꺼내오기
		Zelda z = new Zelda();
		// 게임칩 넣기
		on(z);
		// 포켓몬 고 게임칩 꺼내오기
		PokemonGo p = new PokemonGo();
		// 게임칩 넣기
		on(p);
		//
//		Mario m2 = new Zelda();
//		Mario m3 = new PokemonGo();
//		m.gamestart();
//		m2.gamestart();
//		m3.gamestart();
	}

	
	private static void on(Mario m) {
		m.gamestart();
	}
	
// 메소드 오버로딩 기법을 사용해 실행시키기
//	private static void on(Zelda z) {
//		z.gamestart();
//	}
//
//	private static void on(PokemonGo p) {
//		p.gamestart();
//	}
}
