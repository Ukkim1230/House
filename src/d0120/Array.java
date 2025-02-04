package d0120;

public class Array {
	
	public static void main(String[] args) {
		String[] strs = new String[10];
		//1,11,21,31,41,51,61,71,81,91
		
		for(int i=0;i<strs.length;i++) {
			strs[i] = 1+10*i+"";
		}
		
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}

}