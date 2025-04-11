package 인터페이스;

import 추상클래스.Employee;
// implements 인터페이스 상속
public class Child extends Employee implements Temp,Temp2{

	public Child(String empno, String name, int pay) {
		super(empno, name, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getMoneyPay() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void temp() {
		// TODO Auto-generated method stub
		
	}
	
}
