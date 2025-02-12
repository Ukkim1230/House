package p0205;

import java.util.Random;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Random r = new Random();
		int targetNum = r.nextInt(100) + 1;
		while (true) {
			Scanner s = new Scanner(System.in);
			System.out.print("숫자를 입력하세요 : ");
			String numStr = s.nextLine();
			int num = Integer.parseInt(numStr);

			if (num < targetNum) {
				System.out.println("Up");
			} else if (num > targetNum) {
				System.out.println("Down");
			} else {
				System.out.println("정답");
			}
		}
	}
}