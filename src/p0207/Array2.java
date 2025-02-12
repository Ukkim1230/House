package p0207;

import java.util.Random;

public class Array2 {
	
	public static void main(String[] args) {
		int[] nums = new int[10];
		//1부터 100까지의 난수를 nums에 대입하는데
		//짝수일경우에만 대입해주세요.
		//짝수이면서 3의 배수이거나 5의 배수일때만 대입해주세요
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			int rNum = r.nextInt(100)+1;
			if(rNum%2==0 && (rNum%3==0 || rNum%5==0)) {
				nums[i] = rNum;
				i++;
			}
		}
		Array.printArray(nums);
	}

}