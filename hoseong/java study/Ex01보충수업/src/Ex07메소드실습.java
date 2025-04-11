
public class Ex07메소드실습 {

	public static void main(String[] args) {
	      // 메소드 (반환이 필요한 경우)
	      
	      // 반환값이 굳이~~ 필요없는 경우
	      // - 정수 a, b의 덧셈 결과를 출력해야돼!!
	      int a = 1;
	      int b = 5;
	      sum(a,b);
	      
	      // 반환값이 필요한 경우
	      // 메소드 안에서 알고있는 or 연산해낸 데이터를
	      // main 영역에서 추가연산이나 추가로직에 
	      // 데이터로서 활용해야만 하는 경우
	      
	      // - a+b의 값을 꼭 메인에서 출력해야 함!
	      //   메인에서 a+b의 값에 10을 곱해야 한다고 가정
	      int data1 = realSum(a,b);
	      int data2 = realSum(126,256);
	      
	      System.out.println("(a+b)*10 = " + (data1*10) );
	      System.out.println("(126+256)*10 = " + (data2*10) );
	   }
	   
	   static void sum(int n1, int n2) {
	      // main에서 sum()을 실행할 때,
	      // 정수 두개를 같이 데리고 보낼 수 있음
	      // => 단순 덧셈 결과 출력이기 때문에, 메소드 내부에서 프린트
	      System.out.println(n1+n2);
	   }

	   static int realSum(int n1, int n2) {
	      // 두 수의 덧셈 결과를 활용해서
	      // 메인에서 추가 연산(곱셈)이 들어가기 때문에
	      // 덧셈 결과를 다시 메인 영역으로 return(반환)
	      return n1+n2;
	   }

}
