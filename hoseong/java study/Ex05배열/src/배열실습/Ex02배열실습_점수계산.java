package 배열실습;

import java.util.Scanner;

public class Ex02배열실습_점수계산 {

	public static void main(String[] args) {

//		[실습] 점수계산
//		1. 정수형 데이터 5개를 저장할 수 있는 배열 array 만들기
//		2. 사용자에게 값을 입력받기, 바로 배열의 인덱스에 차례대로 저장
//		3. ~번째 입력 출력
//		4. 전체 저장된 배열 출력

		Scanner sc = new Scanner(System.in); // 입력도구
//		int num; 										// 입력값을 저장할 변수

		int[] array = new int[5]; // 임의의 수를 담을 배열

//		for (int i = 0; i < array.length; i++) { 		// 배열의 인덱스 수만큼 반복문
//			System.out.print("점수 입력 : "); 				// 반복 할 때마다 출력
//			num = sc.nextInt(); 						// 변수에 입력값 저장(반복)
//			array[i] = num; 							// 배열 [i] 번째에 저장한 입력값 저장
//		}
		// 반복하면서 배열의 값을 입력받는 for 문
		for (int i = 0; i < array.length; i++) { 		// 배열의 인덱스 수만큼 반복문
			System.out.print("점수 입력 : "); 				// 반복 할 때마다 출력
			array[i] = sc.nextInt(); 					// 배열 [i] 번째에 저장'할' 값을! 입력값으로 하겠다.
		}

		// array의 전체 데이터를 출력하는 for 문
		System.out.print("점수 : ");
		for (int i = 0; i < array.length; i++) { 		// 배열의 인덱스 수만큼 반복문
			System.out.print(array[i] + ", "); 			// 배열 [i] 번째에 저장된 입력값 출력.
		}
		System.out.print(" 입니다.");
		System.out.println();

		// array를 돌면서, 최고/최저/총합/평균을 계산하고,
		// for 문이 종료된 이후에 4개의 결과를 출력

		// 1. 최고/최저/총합/평균 변수 만들기
		// 2. for문으로 돌면서 계산 하기
		int max = array[0];
		int min = array[0];
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < array.length; i++) {		// 배열 array에 입력된 값의 총 개수만큼 반복할거야
			if (max < array[i]) {						// 만약 'max' 가 배열 [i] 번째 숫자보다 작다면
				max = array[i];							// 'max' 는 '그' [i] 번째 숫자가 된다.
			} 
			if (min > array[i]) {						// 만약 'min' 이 배열 [i] 번째 숫자보다 크다면
				min = array[i];							// 'min' 은 '그' [i] 번째 숫자가 된다.
			}
			sum += array[i];							// 배열 array 의 모든 경우의 수 [i] 들의 합 (복합대입연산자)
			avg = sum / array.length;					// avg 는 sum 의 값을 배열 array 의 인덱스 개수만큼 나눠준 값이 된다.
		}												

		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 점수 : " + sum);
		System.out.println("평균 점수 : " + avg);

	}

}
