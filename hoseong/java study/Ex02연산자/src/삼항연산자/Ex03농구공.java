package 삼항연산자;

import java.util.Scanner;

public class Ex03농구공 {

	public static void main(String[] args) {
//		농구공을 담기 위해 필요한 상자의 개수를 구하는 프로그램 만들기!
//		상자 하나에는 농구공이 최대 5개 들어갈 수 있다.
		
		Scanner sc = new Scanner(System.in);
		int 공 = sc.nextInt();
		int 박스사이즈 = 5;
		int 박스 = 공%박스사이즈==0 ? 공/박스사이즈 : 공/박스사이즈+1;
		
		System.out.println(박스);
		
		
		
		
	}

}
