
public class Ex06배열실습 {

	public static void main(String[] args) {
		// 이중배열
	      // 배열 안에 배열이 있는 형태

	      String[][] school = {
	            { "미리", "이수", "유진" }, //0반
	            { "재영", "태우", "민지" }, //1반
	            { "영화", "원영", "해린" }  //2반
	            };
	      
	      //       행            열
	      // 미리는 0반에서 출석번호 0번
	      System.out.println(school[0][0]);
	      // 이수는 0반에서 출석번호 1번
	      System.out.println(school[0][1]);
	      // 재영은 1반에서 출석번호 0번
	      System.out.println(school[1][0]);
	      // 해린은 2반에서 출석번호 2번
	      System.out.println(school[2][2]);
	      
	      
	      int[][] array = new int[5][5];
	      
	      // 저장 순서
	      // 00 10 20 30 40
	      // 01 11 21 31 41
	      // 02 12 22 32 42...
	      int cnt = 21;
	      for(int i=0; i<5; i++) {
	         for(int j=0; j<5; j++) {
	            array[j][i] = cnt++ ;
	         }
	      }
	      
	      // 출력 순서
	      // 00 01 02 03 04...
	      // 10 11 12 13 14..
	      // 20 21 22 23 24
	      for(int i=0; i<5; i++) {
	         for(int j=0; j<5; j++) {
	            System.out.print(array[i][j] + "\t");
	         }
	         System.out.println();
	      }
	         
	}

}
