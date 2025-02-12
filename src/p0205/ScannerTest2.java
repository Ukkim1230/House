package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		// 1-10의 난수를 생성하구요
		// s의 nextLine()으로 값을 받아와서
		// 업앤다운을 완성하면 됩니다.
		// 예) 입력한 값이 4, 난수가 9 : 업
		// 입력한 값이 3, 난수가 1 :다운
		// 맞췄으면 맞췄따!
		Random r = new Random();
		int rNum= r.nextInt(100) + 1;
		System.out.print("숫자를 입력하세요 : ");
		while (true) {
			Scanner s = new Scanner(System.in);
			String numStr = s.nextLine();
			int num = Integer.parseInt(numStr);

			if (num < rNum ) {
				System.out.println("Up");
			} else if (num > rNum) {
				System.out.println("Down");
			} else {
				System.out.println("정답");
			}

		}
	}
}