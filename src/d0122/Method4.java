package d0122;

public class Method4 {

	static void write() {
		System.out.println();
	}
	static void write(int i) {
		System.out.println(i);
	}
	static void write(double i) {
		System.out.println(i);
	}
	static void write(boolean i) {
			System.out.println(i);
	}
	public static void main(String[] args) {
		write();
		write(1);
		write(1.1);
		write(true);
	}
}