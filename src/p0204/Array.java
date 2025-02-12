package p0204;

public class Array {
	
	public static void main(String[] args) {
		//배열
		//방개수 지정 필수
		//
		int[] nums = new int[3];
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		//사이즈를 늘리거나 줄일 수가 없다
		int[] tmps = nums;
		nums = new int[4];
		for(int i=0;i<tmps.length;i++) {
			nums[i] = tmps[i];
		}//15열 18열중요
		System.out.println(nums[0]);
		
		tmps = nums; //4
		nums = new int[3];
		for(int i=0;i<nums.length;i++) {
			nums[i] = tmps[i];
		}
	}
}