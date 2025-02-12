package p0204;

public class Three {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
			if(i%10==3 || i/10==3) {
				System.out.println("짝");
			}else {
				System.out.println(i);
			}
		}
	}

}
