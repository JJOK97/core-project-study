package 추상클래스;

public class Main {

	public static void main(String[] args) {
		
		RegularEmployee R = new RegularEmployee("001", "김호성", 4000, 300);
		System.out.println(R.print());
		System.out.println(R.getMoneyPay());
		
		TempEmployee T = new TempEmployee("002", "김호성", 4000);
		System.out.println(T.print());
		
		PartTimeEmployee P =new PartTimeEmployee("003", "김호성", 50, 20);
		System.out.println(P.print());
				
		// print 메소드가 중복! 
	}

}
