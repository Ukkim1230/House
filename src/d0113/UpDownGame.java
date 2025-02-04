package d0113;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("원하는 숫자를 적으세요 : ");
		String numStr = s.nextLine();
		int num = Integer.parseInt(numStr);
		Random r = new Random();
		int targetNum = r.nextInt(100)+1;
		while(true) 
			if(num<targetNum) {
				System.out.println("Up");
			}else if(num>targetNum) {
				System.out.println("Down");
			}else {
				System.out.println("정답!");
			}
		}
	}
