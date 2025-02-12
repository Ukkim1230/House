package p0210;

import java.util.Random;
import java.util.Scanner;

public class FindNum {

	public static void main(String[] args) {
		// 사용자한테 숫자를 입력받을 Scanner 를 만듬.
		Scanner scan = new Scanner(System.in);
		// 랜덤 숫자 1-100
		Random r = new Random();
		// 맞출때까지 반복
		int rNum = r.nextInt(100) + 1;// 난수
		int count = 1;
		while (true) {
			System.out.print("원하는 숫자를 입력하세요 : ");
			String numStr = scan.nextLine();
			int num = Integer.parseInt(numStr);
			if (num < rNum) {
				System.out.println("Up!");
			} else if (num > rNum) {
				System.out.println("Down");
			} else {
				System.out.println(count + "번만에 정답!");
				break;
			}
			count++;
		}
		System.out.println("끝!");
	}
}