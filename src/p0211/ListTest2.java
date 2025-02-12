package p0211;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(40);
		nums.add(5);
		nums.add(12);

		// nums에서 제일 작은 값을 찾은 뒤에
		// 0번째방과 값을 바꾼뒤에
		// 출력
		int min = nums.get(0);
		int idx = 0;
		
		for (int i = 1; i < nums.size(); i++) {
			if (min > nums.get(i)) {
				min = nums.get(i);
				idx = i;
			}
		}
		int tmp = nums.get(0);
		nums.set(0, min);
		nums.set(idx, tmp);
		System.out.println(nums);
	}
}