package 배열개념;

public class Ex02이중배열 {

	public static void main(String[] args) {
//		배열은 이차원으로도 만들 수 있다.

//		일차원 배열
//		int[] 배열이름 = new int[개수];

//		이차원 배열
//		int[][] 배열이름 = new int[행][열]

//		1. 이차원배열 생성
		int[][] array = new int[3][4];	// 3 행 4 열
//		2. 이차원배열에 값 할당
		array[0][0] = 1;
//		3. 이차원배열 생성과 할당
		int[][] array2 = { 
				{ 1, 2, 3, 4 },			// 0행
				{ 5, 6, 7, 8 },			// 1행
				{ 9, 10, 11, 12 } 		// 2행
		};
//		4. "7" 데이터에 접근
		System.out.println(array2[1][2]);
//		System.out.println(array2[1]);		//정확히 행과 열을 지정해주어야 한다.
		
		System.out.println(array2[0][3]);
		System.out.println(array2[1][3]);
		System.out.println(array2[2][3]);
		
		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[0][2]);
		System.out.println(array2[0][3]);
	}

}
