import java.util.Scanner;

public class Ex00실습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		do {
			sum += num; // 입력값 누적
			num = sc.nextInt(); // 새 입력값
		} while (num != -1);
		System.out.println("종료!");
		System.out.println(sum);

	}

}
