package 배열실습;

public class Ex01배열실습_가장큰수 {

	public static void main(String[] args) {
//		[실습] 가장 큰 수 찾기

//		1. 정수 데이터 5개를 저장할 수 있는 배열 array 만들기
//		--> 정수 데이터는 6,3,8,4,2
//		2. 배열 안의 데이터 중 가장 큰 값을 출력

		int[] numlist1 = { 6, 3, 8, 4, 2 };					//배열 생성
		int max = numlist1[0];								//최댓값을 담을 변수 생성 => 0 이어도 상관X
		System.out.println(max);	
		for (int i = 0; i < numlist1.length; i++) {			//배열데이터 수 만큼 반복문
			System.out.println(max);
			if (numlist1[i] > max) {
				max = numlist1[i];

			}
		}
		System.out.println(max);

		int[] numbox = { 12, 18, 25, 31, 1, 52, 24 };		//배열 생성
		int maxx = numbox[0];								//최댓값 변수 생성
		for (int i = 0; i < numbox.length; i++) {			//배열데이터 수 만큼 반복문
								
			if (maxx < numbox[i]) {							//만약 i번째 데이터가 maxx변수보다 크다면
				maxx = numbox[i];							//이제부터 maxx는 i번째 데이터이다.
				System.out.println(maxx);
			}
		}
		

	}

}
