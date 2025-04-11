package 변수와자료형;

public class Ex02자료형 {

	public static void main(String[] args) {
//		자바의 자료형
//		- 기본 자료형, 참조 자료형
		
//		1. 기본 자료형
//		- 메모리에 값을 직접 저장한다.
//		- 종류 : 논리형, 문자형, 정수형, 실수형
//		
		
//		1-1) 논리 자료형 : boolean
//		- 참(true)이나 거짓(false)을 저장하는 자료형
		boolean b = true;
		
//		1-2) 문자 자료형 : char
//		- 한 글자만 저장할 수 있음. 작은따옴포를 사용하여 작성
		char c = 'a';
		
//		1-3) 정수 자료형
//		- byte(1byte), short(2byte), int(4byte), long(8byte)
//		--> 데이터의 크기가 의미하는 건 표현할 수 있는 범위.
//		정수를 저장하면, Java 는 기본적으로 int 로 인식.
		
//		1-4) 실수 자료형
//		- float(4byte), double(8byte)
//		- 소수점을 포함하는 수를 저장할 수 있음.
//		- 실수를 저장하면, Java 는 기본적으로 double 로 인식
		
//		[예제] 3.14라는 데이터를 담는 double 타입의 변수 num1을 선언하라.
		double num1 = 3.14;
		
//		[예제] 12.25라는 데이터를 담는 float 타입의 변수 num2를 선언하라.
		float num2 = (float) 12.25; //방법 1
		float num3 = 12.25f; //방법 2 - 키워드 사용
		
		
//		2. 참조 자료형
//		- 객체의 주소를 저장하는 자료형
//		- 데이터가 저장된 메모리의 영역을 가리킴.
//		- String, Array, Class ... 
		
//		2-1 문자열 자료형
//		- String 키워드
//		- 쌍따옴표를 이용하여 여러 글자를 저장할 수 있음.
		String name = "김호성";
		
//		3. 형변환
//		참고자료 : byte(1byte), short(2byte), int(4byte), long(8byte)
		
//		3-1 강제 형변환(명시적 형변환)
//		- 강제로 자료형을 변환 할 때 사용 > 큰 상자에서 작은 상자로 변경
//		- 데이터 손실 발생 가능 > 정확하게 () 등을 사용.
//		- '손실이 일어나도 괜찮아~' 라고 명시해주는 방식
		byte test1 = (byte) 12345;
		System.out.println(test1);
		
//		3-2 자동 형변환(묵시적 형변환)
//		- 작은 용량의 상자에서 큰 상자로 자동으로 변환
		long test2 = 100;
		long test3 = test1;
		System.out.println(test2);
		
		
		
		

	}

}
