package 메소드기초;

public class Ex05메소드실습_약수의_합 {

	public static void main(String[] args) {
		
		int num=10;
		int result=getSumofDivisors(num);
		System.out.println(num+"의 약수의 합 : "+result);
	}
	public static int getSumofDivisors(int num) {			// 최종적으로 값을 int로 출력할거야
		int a=0;											// 찾는건 a
		for(int i=1;i<=num;i++) {							// 미지수 num의 약수들을 찾아서
			if(num%i==0) {
				a+=i;										// a 에 더해줄거야
			}
		}
		
		return a;											// 자 가지고 가
	}
}
