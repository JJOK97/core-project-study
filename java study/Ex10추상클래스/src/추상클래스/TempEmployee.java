package 추상클래스;

public class TempEmployee extends Employee{
	

	private int pay;//연봉
	
	public TempEmployee(String empno,String name, int pay) {
		// 3개의 매개변수를 가진 생성자로서 객체 생성시 empno,name,pay 초기화
		super(empno,name,pay);
	}
	
	public int getMoneyPay() {
		return pay/12;
	}
	

	
	
	
}
