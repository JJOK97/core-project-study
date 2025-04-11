
public class Ex01복합대입_증감연산자 {

	public static void main(String[] args) {

//		증감연산자
//		- 단항연산자
//		- +1 or -1
//		- 데이터++, ++데이터 >> 데이터 +1

		int a = 3;
		int b = 2;

		System.out.println(a + 1); // 실제 a 의 값이 변하지 않음. a = 3
		System.out.println(a++); // 해당 구문 실행 후 연산. a = 3
									// a = 4
		System.out.println(++a); // 연산 후 해당 구문 실행. a = 5

		System.out.println(a++ + ++b); // a = 5 b = 3 > a + b = 8

//		복합대입연산자
//		- 중복되는 식을 줄인 것
		a = b + 1; // 줄일 수 없음
		a = a + 1; // > a += 1
		a*=b; 		// a=a*b
		
		
		
	}

}
