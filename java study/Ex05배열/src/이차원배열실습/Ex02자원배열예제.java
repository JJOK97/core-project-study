package 이차원배열실습;

public class Ex02자원배열예제 {

	public static void main(String[] args) {
//		1. 이차원 배열 array를 만들기 (3행 3열)
		int[][] array = new int[3][3];
//		2. array의 값을 이중for문을 이용해서 할당
										
		int num = 1;										//1부터 커져가는 수 num
		
//		내가속한 i의 행의 길이만큼 반복하면서,
//		열을 반복 출력하는 for문
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num++;
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
