package p0211;

import java.util.ArrayList;
import java.util.Random;

public class Lotto {
	
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();
		Random r = new Random();
		while(lotto.size()<6) {
			int rNum = r.nextInt(45)+1;
			if(lotto.indexOf(rNum)==-1) {
				lotto.add(rNum);
			}
		}
		System.out.println(lotto);
		int min = 0;
		for(int i=0;i<lotto.size();i++) {
			if(min==0) {
				min = lotto.get(i);
			}else if(min>lotto.get(i)) {
				min = lotto.get(i);
			}
		}
		System.out.println("최소값 : " + min);
	}
}