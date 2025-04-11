package 추상클래스;

public abstract class Employee {

	// 접근 제한자
	// public >> protected >> package(default) >> private
	// public : 모든 클래스에서 접근 가능
	// protected : 같은 패키지 + 상속 관계 접근 가능
	// package(default) : 같은 패키지끼리 접근 가능
	// private : 외부 클래스에서 접근 불가

	// 1. 필드

	public Employee(String empno, String name, int pay) {
		super();
		this.empno = empno;
		this.name = name;
		this.pay = pay;

	}

	protected String empno;// 사번
	protected String name;// 이름
	protected int pay;// 연봉

	// 2. 메소드
	public abstract int getMoneyPay();

	public String print() {
		return empno + ":" + name + ":" + pay;
	}

}
