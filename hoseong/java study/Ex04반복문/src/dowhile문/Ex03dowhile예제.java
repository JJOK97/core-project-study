package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex03dowhile예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int rannom = ran.nextInt(9) + 1;
		boolean play = true;

		do {
			int a = rannom;
			int b = rannom;
			System.out.println(a + "+" + b + "=");
			System.out.print("숫자를 입력하세요 : ");
			int answer = sc.nextInt();

			if (answer == (a + b)) {
				System.out.println("정답!");
				break;
			} else {
				System.out.print("틀렸습니다. 다시 하시겠습니까?");
				
				do {
					System.out.print("다시입력하시오");
					String A = sc.next();
					if (A.equals("N")) {
						System.out.println("게임을 종료합니다.");
						play = false;
						break;
					} else if (A.equals("Y")) {
						break;
					}
				} while (true);
				// 문제풀이를 멈춰주는 break
			}
		} while (play);

	}

}
