package p0211;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(3);// nums.get(0)
		nums.add(2);// nums.get(1)
		nums.add(1);// nums.get(2)
		nums.add(10);
		nums.add(7);
		nums.add(5);

		int tmp = nums.get(2);
		nums.set(2,nums.get(0));
		nums.set(0,tmp);
		System.out.println(nums);
	}

}