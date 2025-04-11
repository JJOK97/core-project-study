package 메소드기초;

public class Ex08메소드실습_배열매개변수_2 {

	public static void main(String[] args) {

		int[] array = { 15, 10, 2, 8, 23 };

		avg(array);

	}

	public static void avg(int[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		System.out.println("평균값은 "+(sum /= a.length));
	}
}
