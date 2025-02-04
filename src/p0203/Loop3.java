package p0203;

public class Loop3 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			//짝수일때만 출력
			if(i % 2 ==0) {
				System.out.println(i);
			}
		}
	}
}