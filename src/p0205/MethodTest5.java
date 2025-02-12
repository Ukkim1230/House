package p0205;

public class MethodTest5 {
	static int money = 100;
	
	static void saveMoney(int money) {//static에 있는 변수명은 this로 끌어올 수 없고 클래스명을써야한다.
		MethodTest5.money += money;
	}
	
	int num = 1000;
	void addNum(int num) {
		this.num += num;
	}
	public static void main(String[] args) {
		saveMoney(10);
		System.out.println(MethodTest5.money);
		MethodTest5 mt = new MethodTest5();
		mt.addNum(10);
		System.out.println(mt.num);
	}

}