package 배열실습;

public class Ex05배열실습_배열_두배_만들기 {

	public static void main(String[] args) {

		int[]array = {2,4,6,8,10};
		int[]resert=new int[array.length];
		
		for(int i=0;i<array.length;i++) {
			resert[i]=2*array[i];
			System.out.print(resert[i]+" ");
		}
		
		
		
		
	}

}
