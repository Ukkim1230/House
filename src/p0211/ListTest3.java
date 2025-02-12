package p0211;

import java.util.ArrayList;
import java.util.Random;

public class ListTest3 {
	
	public static void main(String[] args) {
		ArrayList<String> nums = new ArrayList<>();
		Random r = new Random();
		while(nums.size()<6) {
			String rNum = r.nextInt(45)+1+"";
			if(nums.indexOf(rNum)==-1) {
				nums.add(rNum);
			}
		}
		System.out.println(nums);
	}
}