
public class Ex05for문실습 {

	public static void main(String[] args) {


	      // for문
	      for(int i=0; i<5; i++) {
	         System.out.println(i);
	      }
	      
	      // 이중for문
	      // 사과 3개를 썰어와라
	      // -> 사과를 들어서 도마에 놓는건 3번 **큰 for문
	       //    -> 도마에 올려놓은 사과를 써는 작업은 8번 **작은 for문 
	      for(int i=1; i<=3; i++) { // 도마에 놓기
	         System.out.println(i+"번째 사과를 도마에 놓는다");
	         for(int j=1; j<=8; j++) { // 사과 썰기
	            System.out.print(j+"번째 썬다 ");
	         }
	         System.out.println();
	         System.out.println("접시에 옮긴다");
	      }
	      
	      // 별찍기
	      for(int i=1; i<=3; i++) { // 도마에 놓기
	         System.out.println("도마");
	         for(int j=1; j<=i; j++) {
	            System.out.print("썰 ");
	         }
	         System.out.println();
	         System.out.println("접시");
	      }
	      
	      // 역별찍기
	      for(int i=3; i>0; i--) { // 3,2,1 반복. 0종료
	         for(int j=0; j<i; j++) {
	            System.out.print("썰");
	         }
	         System.out.println("도마");
	      }

		
	}

}
