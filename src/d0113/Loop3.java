package d0113;

public class Loop3 {
	//Loop2에서 마지막 , 를 지우세요
	public static void main(String[] args) {
		for(int i = 1;i<10;i++) {
			for(int j = 1;j<10;j++) {
				System.out.print(i + " X "+ j +" = " + (i*j));
			if(j%9!=0) {
				System.out.print(",");
				}else {
					System.out.println("");
				}
			}
		}
	}
}

