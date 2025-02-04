package d0120;

import java.util.Random;

public class Array6 {
	
	public static void main(String[] args) {
		int[] nums = new int[6];
		//1~45까지의 난수를 6개 생성해서
		//nums의 각각대입을 하는데 짝수일 때는 0
		Random r = new Random();
		for(int i = 0; i<nums.length;i++) {
			if(i%2==0) {
				System.out.println("0");
			}
		
			}
		}
}