package 상속기초;

public class Main {

	public static void main(String[] args) {
		
		
		// 1. Parent 자료형 p 객체 생성
		Parent p = new Parent();
		
		// 2. Child 자료형 c 객체 생성
		Child c = new Child();
		
		p.makebibim();
		
		c.makebibim();
		c.makebuldak();
		
		// 상속의 특징 3가지
		// 1. 다중상속이 불가능하다.
		// 2. 상속의 횟수에 제한이 없다.
		// 3. 모든 클래스는 Object(최상위클래스)를 항상 상속받고 있다.
		// 				Object >> 모든 클래스들의 공통의 조상.
		
		// 객체의 Casting(형변환)
		// Reference Type 에서의 형변환은 반드시 상속이 전제되어 있어야 한다.
		// > 객체 내 필드, 메소드의 접근권한을 기준을 강제 vs 자동 결정.
		
		// 1) UpCasting(업캐스팅)
		// : 자식 클래스가 부모 클래스 타입으로
		// 	 자동으로 형변환 하는 것
		// ex) 강아지(자식 클래스)는 동물(부모 클래스)이다 > 자동 형변환
		// 		모든 동물은 강아지다 > X
		
		Parent p2 = new Child();
		// 부모 자료형 레퍼런스 변수면 = new 자식 자료형();
		
		p2.makebibim();
		
		// 2) Down Casting(다운캐스팅)
		
//		Child c2 = (Child) new Parent();
//		c2.makebuldak();
		// 코드에서 빨간줄이 뜬다 = Syntax Error(구문 오류)
		// Exception = 구문 오류는 없으나 실행했을 때 예외상황이 발생하는 경우
		
		// 다운캐스팅
		// : 업 캐스팅 된 객체를 강제 형변환으로 본래의 자료형태로 되돌려 놓는 것
		// 전제조건 : 업 캐스팅 된 객체만 다운 캐스팅 할 수 있다.
		Child c2 = (Child)p2;
		c2.makebuldak();
	}

}
