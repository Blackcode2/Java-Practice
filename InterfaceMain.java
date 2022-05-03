interface Calculable {
	int sum(int x, int y);
	
	//static은선언뿐만 아니라 구현까지 했지만 필요했을때만 쓴다.
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
