package riccardogulin.u5d3.tools;

public class Calculator {
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static double div(int n1, int n2) {
		if (n2 == 0) throw new IllegalArgumentException("Vietato dividere per zero!");
		return n1 / n2;
	}
}
