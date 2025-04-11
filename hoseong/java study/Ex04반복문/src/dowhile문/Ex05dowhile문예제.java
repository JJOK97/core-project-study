package dowhile문;

import java.util.Scanner;

public class Ex05dowhile문예제 {

	public static void main(String[] args) {
//		사용자로부터 숫자를 입력받아, 
//		입력한 숫자의 합이 100 이상이 될 때까지 
//		계속 입력을 받는 프로그램을 작성하세요.
//		단, do-while 문을 사용해야 합니다.

		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요 ");
		int num = 0;
//		System.out.println("입력한 숫자의 합 = "+num);
//		
//		do {
//			
//			System.out.print("숫자를 입력하세요 ");
//			num+=sc.nextInt();
//			System.out.println("입력한 숫자의 합 = " + num);
//			if (num > 100) {
//				System.out.println("완료!");
//				break;
//			}
//		} while (true);

		do {
			System.out.print("숫자를 입력하세요 ");
			num += sc.nextInt();
			System.out.println("입력한 숫자의 합 = " + num);

		} while (num <= 100);
	}

}
