package 이중for문;

import java.util.Scanner;

public class Ex11거스름돈 {

	public static void main(String[] args) {
		//거스름돈
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액을 입력하세요 : ");
		int w = sc.nextInt();
		System.out.println("잔돈 : "+w);
		int a;
		int b;
		int c;
		int d;
		int e;
		
		a=w/10000;
		w%=10000;
		b=w/5000;
		w%=5000;
		c=w/1000;
		w%=1000;
		d=w/500;
		w%=500;
		e=w/100;
		
		System.out.println("10000원 "+a+"장");
		System.out.println("5000원 "+b+"장");
		System.out.println("1000원 "+c+"장");
		System.out.println("500원 "+d+"개");
		System.out.println("100원 "+e+"개");

	}

}
