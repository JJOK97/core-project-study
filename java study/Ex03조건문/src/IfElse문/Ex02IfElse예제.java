package IfElse문;

import java.util.Scanner;

public class Ex02IfElse예제 {

	public static void main(String[] args) {
//		다음은 에버랜드 입장료 계산 프로그램입니다.
//		기본료는 5000원이며, 인원수에 따라
//		지불하는 값을 안내하는 프로그램을 만들어라.
//		단, 20세 미만 미성년자의 경우에는 50% 할인이 적용된다.

		System.out.println("==== EVERLAND RESORT ====");
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int 나이 = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int 인원수 = sc.nextInt();
		int 금액 = 인원수 * 5000;
		if (나이 < 20) {
			System.out.println("총" + 금액 / 2 + "원 입니다.");
		} else {
			System.out.println("총" + 금액 + "원 입니다.");

		}

	}

}
