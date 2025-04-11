package 배열실습;

import java.util.Random;

public class Ex07배열실습_로또중복제거 {

	public static void main(String[] args) {

//		정수형 데이터 5개를 저장할 수 있는 배열 array를 선언하세요
//		배열 안의 데이터를 모두 임의의 값으로 초기화하세요 (1~10)
//		단, 배열에 중복되는 값을 제거해주세요
//		배열 안의 데이터를 모두 출력해주세요						새로운 랜덤값이 기존 배열에 있는지??
//														
		Random ran = new Random(10);
		int[] num = new int[5];
		int a;
		while (true) {
			a = ran.nextInt(10) + 1;
			num[0] = a;
			for (int i = 0; i < num.length; i++) {
				a = ran.nextInt(10) + 1;
				if (num[i] != a) {
					num[i] = a;
					break;
				}
					
					
				}
			
			if (num.length == 5) {
				break;
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}
	
	
	

}
