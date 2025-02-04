package p0203;

public class Array3 {

	public static void main(String[] args) {
		String str = "1,2";
		String[] strs = str.split(",");
		// strs[0]값부터 strs[1]값까지 출력하는 반복문
		//split = 괄호안에 들어가는 것을 기준으로 나누어줌
		int n1 = Integer.parseInt(strs[0]);
		int n2 = Integer.parseInt(strs[1]);
		for(int i=n1;i<=n2;i++) {
			System.out.println(i);
		}
	}
}