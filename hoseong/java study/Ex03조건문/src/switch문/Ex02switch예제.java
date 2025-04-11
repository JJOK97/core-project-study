package switch문;

import java.util.Scanner;

public class Ex02switch예제 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int 월 = sc.nextInt();
		
		if(월>12 || 월<1) {
			System.out.println("잘못된 숫자입니다");
		}
		switch(월) {
		case 3,4,5 :
			System.out.println(월+"월은 봄입니다.");
			break;
		case 6 :
			System.out.println(월+"월은 여름입니다");
			break;
		case 7 :
			System.out.println(월+"월은 여름입니다.");
			break;
		case 8 :
			System.out.println(월+"월은 여름입니다.");
			break;
		case 9 :
			System.out.println(월+"월은 가을입니다.");
			break;
		case 10 :
			System.out.println(월+"월은 가을입니다.");
			break;
		case 11 :
			System.out.println(월+"월은 가을입니다.");
			break;
		case 12 :
			System.out.println(월+"월은 겨울입니다.");
			break;
		case 1 :
			System.out.println(월+"월은 겨울입니다.");
			break;
		case 2 :
			System.out.println(월+"월은 겨울입니다.");
			break;
		default :
			System.out.println("1~12 사이의 숫자를 입력해주세요.");
		}
		
		if (월>12 || 월<1) {
			System.out.println("잘못된 숫자입니다");
		}

	}

}
