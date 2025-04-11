package 클래스객체기초;

public class BankMain {

	public static void main(String[] args) {

		Bank hsBank = new Bank();

//		hsBank.money = 1000; 오류

		hsBank.inMoney(100);// 입금
		hsBank.outMoney(300);// 출금
		
//		System.out.println(hsBank.money); 오류
		
		System.out.println("잔액은 "+hsBank.showMoney());
		

	}

}
