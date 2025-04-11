
public class Ex02변수 {

	public static void main(String[] args) {
		// 변수  : 변할 수 있는 수(변하는 데이터를 담을 수 있는 공간)
		// 정수형태의 데이터를 담을 수 있는 변수를 선언하겠다.(int)
		// 만들어진 변수의 이름을 num이라고 부르겠다.
		
		// Java에서의 변수는 같은이름으로 여러번 변수를 생성할 수 없다.
//		int num;
//		num = 10;
//		=
		int num = 10;
		System.out.println(num);
		
		//int : 정수형
		//30을 새로운 변수에 담고 싶다.
		int number = 30;
		//number의 값을 100으로 바꿔라.
		number=100;
		
		//string : 문자열
		//"  "  :  문자열 데이터 사용 ex)apple
		//'  '  :  문자 데이터 사용. ex) A
		String name;
		name="승환";
		//맞는 타입의 데이터만 활용할 수 있다.
		//ex) string name = 3 (X)
		
		//final : 상수(변하지 않는 데이터) 설정
		final int age = 20;
//		age = 22; (X)
		
		//변수명 규칙
		// 키워드 사용X
		// 대소문자가 구분되며 길이에 제한이 없다.
		// 숫자로 시작 할 수 없다.
		// 특수문자는 '_','$'만 허용한다.
//		그 외에 규칙들 (필수 아님)
//		1. 변수 이름의 첫 글자는 항상 소문자로 시작한다.
//		2. 변수 이름이 여러 단어로 이루어진 경우 단어의 첫글자를 대문자로 한다.
		
//		논리 타입 : boolean : 'true' or 'false'
		boolean b = true;
		
//		문자 타입 : char
		char c = 'a';
		System.out.println(c+1);
		
//		실수 타입 : float, double
		double d = 3.14;
		float f = 5.67f;

	}

}
