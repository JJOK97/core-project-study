package 배열실습;

public class Ex06배열실습_위치출력 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };

		int index1 = 0;
		int index2 = 1;
		int mindis = Math.abs(point[1] - point[0]);

		for (int i = 0; i < point.length; i++) {
			for (int j = i + 1; j <= point.length; j++) {
				if (j == 7) {
					--j;
					break;
				}
				int dis = Math.abs(point[i] - point[j]);
				if (mindis > dis) {
					mindis = dis;
					index1 = i;
					index2 = j;
				}

			}
		}
		System.out.println(index1 + "," + index2);
//		point[0]-point[1];
//		point[0]-point[2];
//		point[0]-point[3];
//		point[0]-point[4];
//		point[0]-point[5];
//		point[1]-point[2];
//		point[1]-point[3];
//		point[1]-point[4];
//		point[1]-point[5];
//		point[2]-point[3];
//		point[2]-point[4];
//		point[2]-point[5];
//		point[3]-point[4];
//		point[3]-point[5];
//		point[4]-point[5];

	}

}
