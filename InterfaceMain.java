interface Calculable {
	int sum(int x, int y);

	static double divide(int x, int y) {
		return x / y;
	}
}

class RealCal implements Calculable {
	public int sum(int x, int y) {
		return x + y;
	}
}


public class InterfaceMain {
	public static void main(String[] args) {
		RealCal c = new RealCal();
		System.out.println(c.sum(2, 1));
	}
}
