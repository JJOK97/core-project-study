package 메소드기초;

public class Ex01메소드개요 {

	public static void main(String[] args) {

//		메소드
//		계속 꺼내서 쓸 코드의 묶음을 만든다.

//		메소드의 장점
//		- 코드 재사용이 가능하다.
//		- 유지보수가 편리해진다

//		메소드 사용법
//		1. 메소드이름();
//		메소드를 만드는 법
//		1. 우리가 주석을 쓰는 공간은 메인 메소드 안.
//		(메인 메소드 : 코드의 시작점)
//		메소드 안에 메소드를 만드는건 불가능함.
//		메인 메소드 바깥에 추가 메소드를 만들어야 한다.
		
//		★메소드 오버로딩(method overloading)★
//		- 같은 이름의 메소드를 여러개 정의할 수 있는 개념.
//		- 기본적으로 메소드명은 중복이 허용되지 않지만,
//		  메소드가 가지는 매개변수의 갯수, 타입이 다르면
//		  서로 다른 메소드라고 인식.
		introduce("안녕하세요");
//		메소드 사용
		introduce();
		introduce();
		introduce();

//		매개변수가 있는 메소드 사용
//		- 메소드를 정의해둔 곳과 똑같이 매개변수의 갯수와 순서를 맞춰야 함
		cook(3, "신라면");
		cook(4, "짜파게티");

//		반환값이 있는 메소드 사용
//		- 반환값으로 변한 메소드 구문을 값으로서 취급이 가능
//		- 메소드를 변수에 담을 수도 있고, 출력도 가능하다.
		age();
		System.out.println(age());

		System.out.println("1 더하기 4는 = " + sum(1, 4));
	}

//	메소드 생성(매개변수X, 반환값X)
//				  void = 반환값X
	public static void introduce() {
		System.out.println("이름 : 호성");
		System.out.println("나이 : 29");
		System.out.println("취미 : 게임");
	}
	
//	기존의 introduce와 이름은 같지만, 매개변수가 달라서
//	서로 별개의 메소드로 인식.
	public static void introduce(String hello) {
		System.out.println(hello);
	}

//	메소드 생성(매개변수O, 반환값X)
//	- 매개변수는 소괄호 안쪽에 작성
//	- 여러 매개변수를 넣는것이 가능
//	- 매개변수의 이름은 메소드 안에서 부를 별명
	public static void cook(int a, String b) {
		System.out.println(b + "을(를)" + a + "개 끓입니다");
	}

//	메소드 생성(매개변수X, 반환값O)
	public static int age() {
		System.out.println("age 메소드 실행");
		return 20;

	}

//	메소드 생성(매개변수O, 반환값O)
//	- 숫자 두개를 매개변수로 받아서, 덧셈 결과를 리턴하는 메소드
	public static int sum(int a, int b) {
		int reselt = a + b;
		return reselt;
	}
}
