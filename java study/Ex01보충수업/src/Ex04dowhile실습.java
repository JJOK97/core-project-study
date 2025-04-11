import java.util.Scanner;

public class Ex04dowhile실습 {

	public static void main(String[] args) {

		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num;

		do {
			num = sc.nextInt();
			sum += num;
			System.out.println("누적결과 : " + sum);
			System.out.print("다시 입력 : ");

		} while (num != -1);
		System.out.println("누적결과 : " + sum);
		System.out.println("종료되었습니다.");
		
		
		

	}

}
