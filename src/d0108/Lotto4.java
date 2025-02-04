package d0108;

import java.util.Random;

public class Lotto4 {
	
	public static void main(String[] args)	{
	Random r = new Random();
	int[] nums = new int[6];
	
	for(int i = 0; i<6; i++) {
		nums[i] = r.nextInt(45)+1;
	}
	for(int i = 0; i<6; i++) {
		System.out.println(nums[i]);
		}
	}
}
