package 이차원배열실습;

public class Ex04배열90도돌리기 {

	public static void main(String[] args) {

		int[][] a = new int[5][5];
		int num = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = num++;

			}

		}

		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j][i] + "\t");
			}
			System.out.println();
		}

//		04,14,24,34,44
//		03,13,23,33,43
	}

}
