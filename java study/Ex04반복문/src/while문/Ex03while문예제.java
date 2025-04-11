package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {

//		사용자의 입력값에서 홀수,짝수 갯수를 세는 프로그램을 만들어라
//		-1을 입력하면 프로그램 종료
//		입력값을 판별. > 홀수, 홀수카운트+1 짝수, 짝수카운트+1

//		1. 사용자에게 입력받기
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int j = 0;
		int h = 0;
		int resert;
//		2. 반복
//		반복조건 : -1이 아니라면!
//		할 일 : 입력값이 짝/홀 판별
//		 > 짝수 홀수 개수 카운트
//		while(num!=-1) {
//			if(num%2==0) {
//				//짝수
//				짝수++;
//			}else {
//				//홀수
//				홀수++;
//			}
//		}

		while (num != -1) {
			resert = num % 2 == 0 ? j++ : h++;
			System.out.println("입력값 : " + num);
			System.out.println("짝수 개수 : " + j);
			System.out.println("홀수 개수 : " + h);
			num = sc.nextInt();
		}
		System.out.println("짝수 개수 : " + j);
		System.out.println("홀수 개수 : " + h);
		System.out.println("종료");

	}

}
