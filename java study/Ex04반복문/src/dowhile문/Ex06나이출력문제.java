package dowhile문;

import java.util.Scanner;

public class Ex06나이출력문제 {

	public static void main(String[] args) {
//		머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 
//		2025년 기준 선생님의 나이가 age 변수에 저장돼있을때, 
//		선생님의 출생 연도를 출력해주세요.
		Scanner sc= new Scanner(System.in);
		System.out.print("선생님의 나이를 입력하세요. ");
		int age = sc.nextInt();
		int year;
		
		year = 2025-age;
		System.out.println("선생님의 출생 연도는 "+year+" 입니다.");
		
		
		
	}

}
