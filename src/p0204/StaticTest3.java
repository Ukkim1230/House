package p0204;

class Test{//접근제어자 없으면 디폴트
	static int num1 = 1;
	int num2 = 2;
}
public class StaticTest3 {
	static int num1;
	public static void main(String[] args) {
		System.out.println(Test.num1);
		Test t = new Test();
		System.out.println(t.num2);
		
	}

}