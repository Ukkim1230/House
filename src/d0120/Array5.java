package d0120;

import java.util.Random;

public class Array5 {
	public static void main(String[] args) {
		int[] nums = new int[6];
		//1-45에서 45까지의 난수를 6개 생성하여
		//nums의 0번째 부터 5번째 방까지 대입해주세요.
		Random r = new Random();
		for(int i = 0;i<nums.length;i++) {
		int rNum = (int)(Math.random()*45);//0~44
		nums[i] = rNum + 1;
		}
		
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
