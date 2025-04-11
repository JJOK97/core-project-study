package while문;

import java.util.Scanner;

public class ex04while문예제 {

	public static void main(String[] args) {
//		[예제3]
//		1. 사용자에게 현재 몸무게, 목표 몸무게를 입력받아 저장
		// int now = sc.nextInt();  현재몸무게
		// int goal = sc.nextInt(); 목표몸무게
		// int w = 0; 				주차별 감량 몸무게
		// int week = 1;			주차
//		2. 주차별 감량 몸무게를 계속 입력받기.
//		while(now>goal) {
//			//감량한 몸무게 입력받기 + week을 입력할때마다 1씩 더하기
			
//			System.out.println(week+"주차 감량몸무게 >> ");
//			w =sc.nextInt();
//			//현재 몸무게에서 감량 몸무게 빼기
//			now = now-w;
//		}
//		3. 종료조건 : 목표 이하로 달성했을때
//		>> 축하합니다!!! 출력하기

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게를 입력하세요 : ");
		int now = sc.nextInt();
		System.out.print("목표 몸무게를 입력하세요 : ");
		int goal = sc.nextInt();
		System.out.println("현재몸무게" + now);
		System.out.println("목표몸무게" + goal);
		int week = 1;
		int w;
		while (now > goal) {
			
			System.out.print("감량한 몸무게를 적어주세요 : ");
			w = sc.nextInt();
			now -= w;
			System.out.println(week++ + "주차 감량 몸무게 : " + w + "kg");
		}
		System.out.println(now + "kg 달성!! 축하합니다!");

	}

}
