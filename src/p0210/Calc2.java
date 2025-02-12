package p0210;

import java.util.Scanner;

public class Calc2 {

	public static void main(String[] args) {
		// 입력받을 Scanner 클래스를 만듬.
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("원하는 숫자를 입력하세요 : ");
			String str = scan.nextLine();
			String[] strs = str.split(",");
			System.out.println("입력한 숫자 : " + str);
			if("q".equals(str.toLowerCase())) {
				break;
			}
			int n1 = Integer.parseInt(strs[0]);
			int n2 = Integer.parseInt(strs[2]);
			String operator = strs[1];
			if ("+".equals(operator)) {
				System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			} else if ("-".equals(operator)) {
				System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			} else if ("*".equals(operator)) {
				System.out.println(n1 + " X " + n2 + " = " + (n1 * n2));
			}else if ("/".equals(operator)) {
				System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			}else if ("%".equals(operator)) {
				System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));
			}else {
				System.out.println("알 수 없는 연산자입니다.");
			}
		}
		System.out.println("계산이 종료되었습니다");
	}
}