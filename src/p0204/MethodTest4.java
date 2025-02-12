package p0204;

public class MethodTest4 {
	int money = 1000;
	//  ↑this를 사용함으로
	void saveMoney(int money) {
		this.money += money;//를 사용함으로 ↑가 아닌
	}
	public static void main(String[] args) {
		MethodTest4 mt = new MethodTest4();
		mt.saveMoney(1000);
		System.out.println(mt.money);//2000

		MethodTest4 mt1 = new MethodTest4();
		mt1.saveMoney(3000);
		System.out.println(mt1.money);//4000 
	}

}