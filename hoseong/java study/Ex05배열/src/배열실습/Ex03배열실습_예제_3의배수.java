package 배열실습;

import java.util.Scanner;

public class Ex03배열실습_예제_3의배수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] x = new int[10];
		for (int i = 0; i < x.length; i++) {
			System.out.print(i+1 + "번 째 정수 입력 : ");
			x[i] = sc.nextInt(); 						// 입력값 배열에 대입
		}
		System.out.print("3의 배수 : ");

		for (int i = 0; i < x.length; i++) {
			if (x[i] % 3 == 0) {						// x[i] 배열의 수들을 3으로 나눈 나머지가 0인 수
				System.out.print(x[i] + " ");			// ==> 3의 배수 '를' 출력하라.
			}
		}

	}

}
