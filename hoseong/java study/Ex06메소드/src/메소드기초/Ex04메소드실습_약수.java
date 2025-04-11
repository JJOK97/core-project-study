package 메소드기초;

public class Ex04메소드실습_약수 {

	public static void main(String[] args) {

//		
		int num1 = 10;
		int num2 = 2;

		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);

	}

	public static boolean isDivisor(int num1, int num2) {		// boolean 타입의 리턴을 가진 메소드를 만들겠다
		boolean a;
		if (num1 % num2 == 0) {									// 나눴을때 나머지가 0인 것은
			a = true;											
		} else
			a = false;
		return a;
	}
}
