package 이중for문;

public class Ex10숫자문제 {

	public static void main(String[] args) {

//		77부터 1까지 내려가는 수의 배열 a
//		1부터 77까지 올라가는 수의 배열 b
//		(a*b)+(a*b)..배열을 모두 더해라

		int a;
		int b;
		int sum = 0;
		for (int i = 0; i < 77; i++) {			// 77번 반복하는 for 문
			a = 77 - i;							// a = 77~1
			b = i + 1;							// b = 1~77
			sum+=a*b;							// sum(합) +=(덧샘대입연산자) a*b
		}

		System.out.println(sum);

	}
}
