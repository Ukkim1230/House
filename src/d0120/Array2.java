package d0120;

public class Array2 {
	public static void main(String[] args) {
		String[] strs = new String[9];
		//5,10,15,20,25,30,35,40,45
		
		for(int i = 0;i<9;i++) {
			strs[i] = 5+5*i+"";
		}
			for(int i = 0;i<9;i++) {
				System.out.println(strs[i]);
		}
	}
}	