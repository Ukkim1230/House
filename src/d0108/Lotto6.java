package d0108;

import java.util.Random;

public class Lotto6 {
	
	public static void main(String[] args)	{
		Random r = new Random();
		int[] nums = new int[3];
		
		for(int i = 0; i<3; i++) {
			nums[i] = r.nextInt(100)+1;
		}
		for(int i = 0; i<3; i++) {
			System.out.println(nums[i]);
		}
	}
}
