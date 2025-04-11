package 단항이항연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {
//		변수  num 값을 입력받아 백의 자리 이하를 버리는 코드를 작성하자.
		
//		1. 입력받는 도구 꺼내오기
//		2. 정수를 입력받아서 num에 저장
//		3. 백의 자리 이하를 버리기
//		> 내가 백의 자리 이하를 버리는 걸 어떻게 계산했지? 생각하기
//		4. 결과값을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println("결과 값 : "+(num-num%100));
		
	}

}
