package p0205;

public class MethodTest {
	//변수명이 같은면 x
	int test() {
		return 1;
	}
	
	static void test2() {
		
	}
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
		int i = mt.test();
		test2();
	}
}