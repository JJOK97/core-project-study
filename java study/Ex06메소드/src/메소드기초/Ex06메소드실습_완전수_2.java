package 메소드기초;

public class Ex06메소드실습_완전수_2 {

	public static void main(String[] args) {

		int startValue = 2;
		int endValue = 1000;

		System.out.print(startValue + " ~ " + endValue + " 까지의 완전수 : ");

//		start~end 완전수를 발견하면 출력하는 메소드
		getPerfectNumber(startValue, endValue);
	}

	public static void getPerfectNumber(int s, int e) {

//		s~e 완전수인지 판단
		for (int i = s; i <= e; i++) {
			int sum = 0;
//			s가 완전수라는 근거 : 1~s 미만 까지의 수를 s 로 나눠보고,
//			 나누어 떨어지는 수의 합이 s와 같아야 한다.
			for (int j = 1; j < i; j++) {
//				j 는 1 부터 i 미만 수까지 반복하면서
//				i 에 나누어 떨어지는지 검사
//				나누어 떨어졌다면 합산
				if (i % j == 0) {
					sum += j;
				}
			}
			if (sum == i) {// 완전수라면
				System.out.print(sum + " ");
			}
		}

	}
}
