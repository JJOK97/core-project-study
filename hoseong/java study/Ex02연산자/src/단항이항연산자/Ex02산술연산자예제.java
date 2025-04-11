package 단항이항연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {
//		사용자에게 두 수를 입력받아
//		산술연산자를 적용해보기
		
//		1. 입력도구 꺼내기
		Scanner sc = new Scanner(System.in);
		
//		2. 사용자에게 숫자 두개 입력받기
		System.out.print("첫번째 숫자 >");
		int a =sc.nextInt();
		System.out.print("두번째 숫자 >");
		int b =sc.nextInt();
		
		
		System.out.println("더한 값 : "+(a+b));
		System.out.println("뺀 값 : "+(a-b));
		System.out.println("곱한 값 : "+(a*b));
		System.out.println("나눈 값 : "+((double) a / (double) b));

	}

}
