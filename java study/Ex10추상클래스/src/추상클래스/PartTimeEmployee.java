package 추상클래스;

public class PartTimeEmployee extends Employee {


	private int workDay; //일수
	
	public PartTimeEmployee(String empno,String name, int pay, int workDay) {
		// 4개의 매개변수를 가진 생성사로서 객체 생성 시 empno,name,pay,workDay를 초기화
		super(empno,name,pay);
		this.workDay=workDay;
	}
	
	public int getMoneyPay () {
		return pay*workDay;
	}
	

	
}
