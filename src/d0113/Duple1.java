package d0113;

public class Duple1 {

	public static void main(String[] args) {
//		int i=10;
//		do {
//			System.out.println(i++);
//		}while(i<10);
//		
//		while(i<10) {//참이면 반복됨
//			System.out.println(i++);
//		}
		int[] nums = new int[]{1,2};
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==1) {
				System.out.println(i +"번째 방에 1이 있습니다.");
				break;
			}
			System.out.println(i);
		}
	}
}