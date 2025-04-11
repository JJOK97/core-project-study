package for문;

import java.util.Scanner;

public class Ex01for문기초 {

	public static void main(String[] args) {
//		for 문
//		while 문 과 달리, 반복 횟수가 정해진 반복문
//		기본구조
//		for(초기화구문;조건식;반복후작업) {로직}
//		- 초기화구문 : 반복문이 처음 시작될 때 딱 한번만 실행
//		- 조건식 : 반복 조건 (true)일 때만 반복 (횟수 설정)
//		- 반복후작업 : 로직 반복 후 작업해야 하는 파트.
		
//		- 주의점 : for문 안쪽에서 만든 변수는 바깥에서 인식 불가.
//		-- i이 값은 중괄호 안에서 바꿀 수 있다.
//		-- for문 안쪽에서 만든 변수를 사용하기 위해서 이전에 변수 창출.

//		i 가 0 부터 5 가 되기까지 반복
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}

		for (int i = 96; i > 72; i--) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		for (int i = 96; i > 72; i--) {
//
		}
		int sum = 0;
		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				sum -= i;
				System.out.print(" " + -i);
			} else {
				sum += i;
				System.out.print(" " + i);
			}
		}
		System.out.println();
		System.out.println("결과 : " + sum);

		for (int i = 1; i < 10; i++) {
			System.out.println("2 * " + i + " = " + 2 * i);
		}
		
//		구구단 만들기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println(num + "단 구구단을 출력합니다.");
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

	}

}
