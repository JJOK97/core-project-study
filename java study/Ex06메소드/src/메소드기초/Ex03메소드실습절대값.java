package 메소드기초;

import java.util.Scanner;

public class Ex03메소드실습절대값 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수 입력 : ");
		int num2 = sc.nextInt();

		int result = getAbsoluteValue(num1, num2);
		System.out.println("결과 확인 : " + result);
	}

	public static int getAbsoluteValue(int a, int b) {
		int reselt;
		if (a < b) {
			reselt = b - a;
		} else  {
			reselt = a - b;
		}
		return reselt;
	}
}
