package dowhile문;

import java.util.Scanner;

public class Ex07양꼬치문제 {

	public static void main(String[] args) {
//		양꼬치가게 10인분 음료수 1개 양꼬치 1인분 12,000, 음료수 2,000
//		양꼬치 n인분 음료수 k개 총 얼마?

		Scanner sc = new Scanner(System.in);

//		do {
//
//			System.out.print("양꼬치 먹은 인분을 입력 : ");
//			int n = sc.nextInt();
//			System.out.print("음료수 마신 병수를 입력 : ");
//			int k = sc.nextInt();
//
//			if (n / 10 != 0) {
//				k -= n / 10;
//				System.out.println("총 " + (12000 * n + 2000 * (k * n / 10)) + " 입니다.");
//
//			} else {
//				k -= n / 10;
//				System.out.println("총 " + (12000 * n + 2000 * k) + " 입니다.");
//			}
//		} while (true);

		do {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if (n / 10 != 0) {
				k -= k * 2000 + n / 10;
				System.out.println((12000 * n + k) + "원");
			} else {
				k -= 2000 * k + n / 10;
				System.out.println((12000 * n + k) + "원");
			}
		} while (true);
	}
}
