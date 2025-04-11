package 다중if문;

import java.util.Scanner;

public class Ex01다중if예제 {

	public static void main(String[] args) {
//		다중if문
//		if(조건1) {
//			조건1이 참일때
//		} else if(조건2) {
//			조건 2가 참일때
//		} else if(조건3) {
//			조건 3이 참일때
//		} else {
//			조건 1~3이 다 거짓일때
//		}

		// Int타입의 변수 totalScore를 선언하고 키보드로 값을 입력받으세요.
//		totalScore가 90점 이상이면 "A학점입니다."
//		80점 이상 90점 미만일경우 "B학점입니다."
//		70점 이상 80점 미만일경우 "C학점입니다."
//		70점 미만일 경우 "D학점입니다."를 출력하는 프로그램을 만드세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int 점수 = sc.nextInt();
		if (점수 >= 90) {
			System.out.println("A학점입니다.");
		} else if (점수 >= 80 && 점수 < 90) {
			System.out.println("B학점입니다.");
		} else if (점수 >= 70 && 점수 < 80) {
			System.out.println("C학점입니다.");
		} else {
			System.out.println("D학점입니다.");
		}

	}
}