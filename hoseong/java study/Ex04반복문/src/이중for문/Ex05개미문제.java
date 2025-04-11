package 이중for문;

import java.util.Scanner;

public class Ex05개미문제 {

	public static void main(String[] args) {
//		. 입문 - 세균 증식
//		어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
//		처음 세균의 마리수 n과 경과한 시간 t가 변수로 주어질 때 t시간 후 세균의 수를 출력하세요
//		(n이 2, t가 10이라면, 결과는 2048)

		Scanner sc = new Scanner(System.in);
		System.out.print("처음 세균의 마리수를 입력 > ");
		int n = sc.nextInt();
		System.out.print("경과한 시간 > ");
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			n *= 2;
		}

		System.out.println("증식한 세균의 수 : " + n);
	}

}
