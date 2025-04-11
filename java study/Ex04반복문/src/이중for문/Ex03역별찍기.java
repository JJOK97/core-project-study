package 이중for문;

import java.util.Scanner;

public class Ex03역별찍기 {

	public static void main(String[] args) {

//		i의 값이 커질수록 j의 범위가 줄어든다.
//
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력 >> ");
		//
		int num = sc.nextInt();
		
//		역방향 별 찍기 + 숫자 입력하기
		for (int i = 0; i < num; i++) {

			for (int j = num; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		정방향 별 찍기
		for (int j = 1; j <= 5; j++) {			//5번 쓸거야(5줄 쓸거야)	

			for (int i = 1; i <= j; i++) {						// i 부터 j 까지 반복할거야
				System.out.print("*");							// (무엇을?) "*"을 쓰는걸
			}
			System.out.println();				//쓴거 엔터칠거야
		}

		for (int j = 0; j < 5; j++) {
//	         System.out.println("j for문 시작점");
	         System.out.println("j는 " + j);
	         for (int i = 0; i <= j; i++) { 
	            System.out.println("i는 " + i + ", 조건:"+i+"(i)<="+j+"(j)");
//	            System.out.println("*출력 ");
	         }
//	         System.out.print("개행");
	         System.out.println();
	      }
}

}
