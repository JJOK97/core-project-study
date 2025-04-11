package 단순if문;

import java.util.Scanner;

public class Ex02단순if예제 {

	public static void main(String[] args) {
//		int 타입의 변수 num 을 선언하고 키보드로 값을 입력받으시오.
//		만약 num 이 3의 배수이자 5의 배수라면
//		"3과 5의 배수입니다"라고 출력하라
		
//		입력 도구 꺼내기
		Scanner sc = new Scanner(System.in);
//		안내문 띄우기
		System.out.print("정수를 입력하세요 : ");
//		입력받은 숫자를 num에 대입
		int num = sc.nextInt();
//		조건문 if 문 작성.
		if (num%3==0 && num%5==0 && num!=0) {
			System.out.println("3과 5의 배수입니다");
		} 

	}

}
