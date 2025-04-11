import java.util.Random;
import java.util.Scanner;

public class Ex03반복문 {

	public static void main(String[] args) {

//		랜덤수 맞추기
		Scanner sc = new Scanner(System.in); // 입력도구
		Random ran = new Random(); // 랜덤도구

		int ranNum = ran.nextInt(10) + 1; // 1 ~ 10 랜덤 수 생성

//		1. 무한 반복으로 만들고
//		안쪽에서 if(정답) { break; }
//		while (true) {
//			System.out.println("랜덤수 맞추기 >> "); 	// 안내
//			int answer = sc.nextInt(); 				// 입력받기
//
//			if (ranNum == answer) { 				// 랜덤==입력값
//				System.out.println("정답!"); 			// 출력
//				break;
//			} else {
//				System.out.println("오답!");
//			}
//		}
//		

//		2. while( 오답 )
//			-> 오답이라면 한번 더 반복하겠다
//		while 안쪽에 입력값 answer를 while 바깥쪽에서 만들어 주어야 함.
//		int answer = sc.nextInt();
//		while (answer != ranNum) {					
//			System.out.println("랜덤수 맞추기 >> "); 	// 안내
//			answer = sc.nextInt(); 					// 입력받기
//
//			if (ranNum == answer) { 				// 랜덤==입력값
//				System.out.println("정답!"); 			// 출력
//				break;
//			} else {
//				System.out.println("오답!");
//			}
//		}

//		  do while로 변형

		System.out.print("랜덤수 맞추기 >> ");
		int answer;								//answer 답 상자 만들기
		do {									//실행한다

			System.out.print("랜덤수 맞추기 >> ");	//안내
			answer = sc.nextInt();				//입력
			if (ranNum == answer) {				//if 정답이면 break;
				System.out.println("정답!");
				break;
			} else {
				System.out.println("오답!");

			}

		} while (answer != ranNum);				//정답이 아니면 반복.

	}

}
