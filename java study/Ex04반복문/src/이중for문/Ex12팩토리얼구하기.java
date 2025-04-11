package 이중for문;

import java.util.Scanner;

public class Ex12팩토리얼구하기 {

	public static void main(String[] args) {
		
//		p= 구하고싶은 팩토리얼 값
//		a= 팩토리얼 최종 값
//		i= 팩토리얼 식에서 마지막 수식 값 : 1
		
		Scanner sc= new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int a=1;
		int i=1;
		for(int p = sc.nextInt();i<=p;p--) {
			a*=p; 
		}
		

//		do {
//			p=sc.nextInt();
//			a=p*(p-1);
//		}while(p>=1);
		System.out.println(a);
		
		
		
	}

}
