package for문;

import java.util.Scanner;

public class Ex02for문예제 {

	public static void main(String[] args) {
//		

		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 >> ");
		int num = sc.nextInt();
		System.out.print("어느 수까지 출력 >> ");
		int su = sc.nextInt();
		System.out.println(num + "단 을 출력합니다.");
		for (int i = 1; i <= su; i++) {
			System.out.println(num + " * " + i + " = " + i * num);
		}
		
		

	}

}
