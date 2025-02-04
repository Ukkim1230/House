package d0122;

public class Method2 {
	
	int add(int n1,int n2) {
		return n1+n2;
	}
	void add() {
		
	}
	String add(String s,int n) {
		return s + n;
	}
	
	public static void main(String[] args) {
		Method2 m = new Method2();
		int sum = m.add(0, 0);
		m.add();
		String str = m.add("1",1);
		System.out.println(m.add("1",1));
	}

}