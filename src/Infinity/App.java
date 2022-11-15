package Infinity;

public class App {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		// Positive Infinity
		System.out.println(10 / 0.0);

		// Negative Infinity
		System.out.println(-10 / 0.0);

		//NaN
		System.out.println(0.0 / 0.0);
		
		System.out.println(-0.0 / 0.0);

	}

}
