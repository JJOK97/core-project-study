package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex02dowhile예제 {

	public static void main(String[] args) {
//		랜덤수 만드는 법
//		1. 랜덤 수를 만들어주는 도구 꺼내기
		Random ran = new Random();
//		2. 도구를 이용해서 랜덤수를 생성
//		소괄호 안에 추출하고 싶은 숫자의 개수를 적기
		int rannum = ran.nextInt(9) + 1;
//		System.out.println(rannum);

		Scanner sc = new Scanner(System.in);
		do {
//		3. 랜덤 수 2개 생성
		int a = ran.nextInt(9) + 1;
		int b = ran.nextInt(9) + 1;
//		
//		4. 사용자에게 질문+답
		System.out.println(a + "+" + b + "=");
		int answer = sc.nextInt();

//		5. 정답 판별
		if (answer == a + b) {
			System.out.println("정답!");
		}else {
			System.out.print("틀렸습니다 계속 하시겠습니까?");
			String go = sc.next();
//			String의 값을 비교하는 방법 : 변수.equals(비교값)
			if(go.equals("N")) {
			break;
			}
		}
		}while(true);

	}

}
