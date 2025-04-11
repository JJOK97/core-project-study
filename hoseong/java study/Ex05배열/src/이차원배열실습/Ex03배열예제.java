package 이차원배열실습;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex03배열예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int num = 1;
		int[][] a = new int[n][t];

//		for (int col = 0; col < n; col++) {
//			for (int row = 0; row < t; row++) {
//				a[row][col] = num++;
//				System.out.print(a[row][col] + "\t");
//			}
//		}
		for (int i = 0; i < a.length; i++) { // 열 고정
			for (int j = 0; j < a.length; j++) { //행 반복
				a[j][i]=num++;
				
			}
		}
		
		for (int i = 0; i < a.length; i++) { // 행 고정
			for (int j = 0; j < a.length; j++) { //열 반복
				System.out.print(a[i][j]+" ");
				
			}System.out.println();
		}
//		for (int row = 0; row < n; row++) {
//			for (int col = 0; col < n; col++) {
//				System.out.print(a[row][col] + "\t");
//			}
//			System.out.println();
//		}
//		a[0][0] = 1;
//		a[1][0] = 2;
//		a[2][0] = 3;
//		a[3][0] = 4;
//		a[4][0] = 5;
//		a[0][1] = 1;
//		a[1][1] = 2;
//		a[2][1] = 3;
//		a[3][1] = 4;
//		a[4][1] = 5;
//		a[0][2] = 1;
//		a[1][2] = 2;
//		a[2][2] = 3;
//		a[3][2] = 4;
//		a[4][2] = 5;
//		a[0][3] = 1;
//		a[1][3] = 2;
//		a[2][3] = 3;
//		a[3][3] = 4;
//		a[4][3] = 5;
//		a[0][4] = 1;
//		a[1][4] = 2;
//		a[2][4] = 3;
//		a[3][4] = 4;
//		a[4][4] = 5;

	}

}
