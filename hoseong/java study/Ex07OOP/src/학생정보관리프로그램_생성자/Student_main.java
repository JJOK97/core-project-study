package 학생정보관리프로그램_생성자;

public class Student_main {

	public static void main(String[] args) {

//		Student 자료형 stu1 객체 생성
		Student_생성자 stu1 = new Student_생성자();

		stu1.setName("김호성");
		stu1.setNumber("20241111");
		stu1.setAge(20);
		stu1.setScoreJava(50);
		stu1.setScoreWeb(99);
		stu1.setScoreAndroid(77);

//		stu2.setName("임경남");
//		stu2.number("20242222");
//		stu2.age("20");
//		stu2.scoreJava("90");
//		stu2.scoreWeb("25");
//		stu2.scoreAndroid("55");

//		이름, 자바 점수 출력

//		System.out.println(stu1.getName()+stu1.getScoreJava());
		System.out.println(stu1.getName());
		System.out.println(stu1.getScoreJava());
//		메소드 이름위에 마우스 올려서 포스트잇 모양이 뜨면
//		초록색 동그라미 우측에 있는 자료형이 리턴타입을 의미한다.
		
//		Student 자료형 stu2 객체 생성
		Student_생성자 stu2 = new Student_생성자("장지선","20252222",32);
		System.out.println(stu2.getName());
//		new Student() > 객체를 생성하는 순간에 실행되는 메소드
//		생성자(constructor)

	}

}


//두마리 포켓몬 생성
//포켓몬 선택
//공격, 스킬 공격 선택
//선택한 포켓몬이 다른 포켓몬을 공격