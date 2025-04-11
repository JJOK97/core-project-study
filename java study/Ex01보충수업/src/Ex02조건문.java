
public class Ex02조건문 {

	public static void main(String[] args) {
//		조건문
//		- 단순if : 조건이 참이면 A를 실행한다.
//		- if/else : 조건이 참이면 A, 나머지(else)는 B를 실행한다.
//		- 다중if : 조건을 위에서부터 하나씩 검사.
//					true가 나오면 실행하고 종료!
//		- switch~case : 검사조건이 무조건 딱 덜어지는 값이다.
//						여러 조건을 묶을 수 있다.
		int a = 2;
		switch (a) {
		case 1:
			System.out.println("1임");
			break;
		case 2:
			System.out.println("2임");
			break;
		case 3:
			System.out.println("3임");
		default:
			System.out.println("아무것도 아님");
		}
	}

}
