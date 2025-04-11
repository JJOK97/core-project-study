package dowhile문;

import java.util.Scanner;

public class Ex04dowhile예제 {

	public static void main(String[] args) {
//		아이디와 비밀번호를 입력받고, 아래와 일치할 경우
//		"로그인 성공" 일치하지 않을 경우에는 "로그인 실패"를 출력하세요.
//		아이디 : test 			비밀번호 : test1234

		Scanner sc = new Scanner(System.in);
		String id = "test";
		String pw = "test1234";
		int count = 0; //로그인 실패횟수
		do {
			
			System.out.print("아이디를 입력하세요 : ");
			String ida = sc.next();
			System.out.print("패스워드를 입력하세요 : ");
			String pwa = sc.next();
//
			if (ida.equals(id) && pwa.equals(pw)) {
				System.out.println("로그인 성공");
				break;
			} else {
				System.out.println("로그인 실패");
				count++;
				if(count==3) {
					System.out.println("3번이상 틀렸습니다");
					break;
				}
			}
		} while (true);

	}

}
