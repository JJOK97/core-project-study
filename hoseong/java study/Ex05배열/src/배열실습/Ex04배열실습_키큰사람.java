package 배열실습;

import java.util.Scanner;

public class Ex04배열실습_키큰사람 {

	public static void main(String[] args) {

////		머쓱이는 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
//		머쓱이네 반 친구들의 키가 담긴 정수 배열 array와
//		머쓱이의 키 height가 변수로 주어질 때,
//			머쓱이보다 키 큰 사람 수를 출력하세요
////		-- array는 {149, 180, 192, 170} -- 키큰사람수가 3

		Scanner sc = new Scanner(System.in);
		int height = 160;

		int[] array = { 149, 180, 198, 170 };
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (height < array[i]) {
				count++;							//count = 머쓱이보다 큰 사람 수
			}
			
		}
		System.out.println("머쓱이보다 키가 큰 사람은 "+count+"명 입니다.");

	}

}
