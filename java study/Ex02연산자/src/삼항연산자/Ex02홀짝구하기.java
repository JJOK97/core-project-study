package 삼항연산자;

import java.util.Scanner;

public class Ex02홀짝구하기 {

	public static void main(String[] args) {
//		1. 입력도구
		Scanner sc = new Scanner(System.in);
//		2. 정수 입력 후 저장
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
//		3. 입력받은 정수가 홀수인지 짝수인지 판별
		String A = num%2==0 ? "짝수" : "홀수";
//		4. 결과를 출력
		System.out.println("num은 "+A);
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num = sc.nextInt();
//		System.out.println(num%2==0 ? "짝수" : "홀수");

	}

}
