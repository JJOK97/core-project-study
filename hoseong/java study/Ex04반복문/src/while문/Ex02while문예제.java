package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {
//		-1을 입력받으면 프로그램 종료
//		사용자의 입력값은 누적해서 가지고 있어야 함.

//		입력값 누적용 변수
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();  				//중복코드

		while (num != -1) {
								// 사용자에게 입력받은 값을 누적 저장
								//	sum=sum+num;
			sum += num;
			System.out.println("누적결과 : " + sum);
			System.out.print("다시 입력 : ");
			num = sc.nextInt();					//중복코드(반복해서 입력해야하기 때문)
		}
		System.out.println("누적결과 : " + sum);
		System.out.println("종료되었습니다.");
		
		
//		while 문 do while 문으로 바꾸기!
//		while (조건) >> do{ } while (조건);
//		while (조건){로직} >> do{while의 로직}
//		while (조건){로직}끝나고 실행할 거 
//		>> do{while로직}while(조건);끝나고 실행할 거
//		
//		차이점. num = sc.nextInt(); >> 중복 코드 없어짐.
		
		
		
		
	}

}
