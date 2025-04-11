package 이차원배열실습;

public class Ex01기초예제 {

	public static void main(String[] args) {

		int[][] array2 = { { 1, 2, 3, 4 }, // 0행
				{ 5, 6, 7, 8 }, // 1행
				{ 9, 10, 11, 12 } // 2행
		};

		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[0][2]);
		System.out.println(array2[0][3]);

//		array2[0][0];
//		array2[0][0];
//		array2[0][0];
//		array2[0][0];
//		for문으로 1,2,3,4 출력
//		array2.length : array2의 행의 개수
		for (int i = 0; i <= array2.length; i++) {
			System.out.println(array2[0][i]);
		}
//		array2[0].length : array2의 0번 행이 가지고 있는 데이터의 개수
//		for문으로 1,2,3,4 출력
		for (int i = 0; i < array2[0].length; i++) {
			System.out.println(array2[0][i]);
		}
//		for문으로 5,6,7,8 출력
		for (int i = 0; i < array2[1].length; i++) {
			System.out.println(array2[1][i]);
		}
//		for문으로 9,10,11,12 출력
		for (int i = 0; i < array2[2].length; i++) {
			System.out.println(array2[2][i]);
		}
		
		for(int j =0; j<array2.length;j++) {
			for(int i=0;i<array2[j].length;i++) {
				System.out.println(array2[j][i]);
			}
		}

//		for(int i =0;i<=array2.length;i++) {
//			for(int j-0;j<array2.length;j++) {
//				System.out.println(array2[j][i]);
//			}
//		}

	}

}
