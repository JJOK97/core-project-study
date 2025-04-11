package 클래스객체기초;

public class PersonMain {

	public static void main(String[] args) {
		// 설계도(클래스)를 기반으로 객체를 만들어보자!

		// 객체 생성
		// 설계도명 객체 = new 설계도명();
		// **객체 생성할때 붙는 () : 생성자 메소드
		Person hoseong = new Person();
		Person jisun = new Person();

		// 객체에 데이터를 할당(age,name) - 속성
		hoseong.age = 29;
		hoseong.name="김호성";
		jisun.age =32;
		jisun.name="장지선";
		
		// 객체가 가진 데이터 출력해보기
		System.out.println(hoseong.age);
		
		// 객체가 가진 기능 실행해보기
		hoseong.sleep();
		hoseong.introduce();
		hoseong.eat("치킨");
		hoseong.eat("콜라");
		jisun.sleep();
		jisun.introduce();
		jisun.eat("치킨무");
		jisun.eat("제로콜라");
		jisun.walk("공원");
		
		//person 설계도를 기반으로 새로운 사람 만들어보기!
	}

}
