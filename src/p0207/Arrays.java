package p0207;

public class Arrays {
	static void printArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
	public static void main(String[] args) {
		int[] nums = new int[] {10,4,2,3};
		printArray(nums);
		int[] tmpNums = nums;
		nums = new int[5];
		for(int i=0;i<tmpNums.length;i++) {
			nums[i] = tmpNums[i];
		}
		printArray(nums);
		
	}

}
