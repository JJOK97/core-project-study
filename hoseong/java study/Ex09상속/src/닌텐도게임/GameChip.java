package 닌텐도게임;

public abstract class GameChip {
	// 1. abstract 추상클래스
	// - 추상메소드를 하나라도 가지고 있다면 반드시 추상클래스가 되어야 한다.
	// - 추상클래스도 일반 메소드를 가질 수 있다.
	// - abstarct 키워드를 사용해 선언
	
	public void temp() {
		System.out.println("메소드");
	}
	
	public abstract void gamestart();
	// 2. 추상 메소드
	// - 바디 { }가 없는 메소드
	// - 선언( : 리턴타입, 매개변수, 메소드명)은 있으나
	// 로직이 구분되지 않은 메소드
	// abstract 키워드를 사용해 선언
	
	
	
}
