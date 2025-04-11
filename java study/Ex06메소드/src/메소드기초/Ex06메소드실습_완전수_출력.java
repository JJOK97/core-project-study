package 메소드기초;

public class Ex06메소드실습_완전수_출력 {

	public static void main(String[] args) {

//		startValue ~ endValue 까지의 숫자 중 완전수를 출력하는
//		getPerfectNumber() 메소드를 구현하라

//		조건
//		startValue:2
//		endValue:1000
//		완전수란, 자기 자신을 제외한 약수(진약수)들의 합이 자기 자신이 되는 수를 말한다. 
//		예를 들어, 6의 약수는 자기 자신인 6을 제외한 1, 2, 3이고 진약수들의 합은 1 + 2 + 3 = 6, 즉 자기 자신이므로 6은 완전수다
		getPerfectNumber(2,1000);

	}
//public static void getPerfectNumber() {
//	
//	for(int i=2;i<=1000;i++) {					2부터 1000까지 반복문
//		int a=i;								임의의 a = 2~1000
//		int b=0;								확인을 위한 수 b
//		if (a%2==0) {							a를 2로 나누었을 때 나머지가 0(짝수)
//			for(int j=1; j<=a/2;j++)			
//				if(a%j==0) {
//					b+=j;
//				}
//		}else {
//			for(int j=1;j<=a/2+1;j++)
//				if(a%j==0) {
//					b+=j;
//				}
//		}
//		if(b==a)
//			System.out.print(a+" ");
//	}
//}

	public static void getPerfectNumber(int startValue, int endValue) {
		int a = 0;
		for (int i = 2; i <= 1000; i++) {

			if (i % 2 == 0) {
				for (int j = 1; j <= i; j++) {
					if (i % j == 0) {
						a += j;
					}
				}
			}
			if (a == i) {
				System.out.println(a + " ");
			}
		}
	}
}
