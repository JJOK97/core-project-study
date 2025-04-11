package 추상클래스;

public class RegularEmployee extends Employee {

	private int bonus;// 보너스

	public RegularEmployee(String empno, String name, int pay, int bonus) {
		// 4개의 매개변수를 가진 생성자로서 객체 생성시 empno, name, pay, bonus를 초기화
		super(empno,name,pay);
		this.bonus = bonus;
	}

	public int getMoneyPay() { // 월 급여를 계산 후 리턴 (pay+bonus)/12
		return (pay + bonus) / 12;
	}

}
