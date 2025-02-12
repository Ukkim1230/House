package p0210;

import java.util.ArrayList;
import java.util.Random;

public class FindMinNum {

	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> nums = new ArrayList<>();
		while(nums.size()<10) {
			int rNum = r.nextInt(50)+1;//1-50
			if(nums.indexOf(rNum)==-1) {//-1은 배열에 없는 값
				nums.add(rNum);//배열에 없다면 추가해
			}
		}
		System.out.println(nums);

		int min = 0;
		for(int i=0;i<nums.size();i++) {
			if(min == 0) {
				min = nums.get(i);
			}else if (min>nums.get(i))
				min = nums.get(i);
		}
		System.out.println("최소값 : " + min);
		
		int max = 0;
		for(int i=0;i<nums.size();i++) {
			if(max ==0) {
				max = nums.get(i);
			}else if(max<nums.get(i)) {
				max = nums.get(i);
			}
		}
		System.out.println("최댓값 : " + max);
	}
}