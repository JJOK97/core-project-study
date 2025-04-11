package 이중for문;

public class Ex04별찍기응용 {

	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {			//나는 5줄을 쓸거야
//			공백
//			전체 줄 수 - 현재 진행된 줄 수
//			
			for (int i = 0; i < 4-j; i++) {		//4-j 만큼 반복할거야
				System.out.print(" ");			//(무엇을?)띄여쓰기 " "를 i번 쓸거야
			}
			for (int i = 0; i < j+1; i++) {		//j+1 만큼 반복할거야
				System.out.print("*");			//(무엇을?) "*"을 i번 쓸거야
			}
			System.out.println();
		}

	}

}
