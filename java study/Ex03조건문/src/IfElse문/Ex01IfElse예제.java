package IfElse문;

import java.util.Scanner;

public class Ex01IfElse예제 {

	public static void main(String[] args) {
//		사용자가 입력해준 점수(grade)가
//		60 이상이라면 "합격입니다" 출력
//		아니라면, "불합격입니다" 출력

//		if~Else 문
//		if(조건식) {
//		참일 경우 실행
//	} else {
//		거짓인 경우 실행
//	}

//		도구 꺼내기
		Scanner sc = new Scanner(System.in);
//		안내문 작성
		System.out.print("점수를 입력하세요 : ");
//		입력값 대입하기
		int num = sc.nextInt();
//		ifElse 문 작성하기
		if (num >= 60) {
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다");
		}

	}

}
