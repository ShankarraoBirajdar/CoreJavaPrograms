package PrivateMethod;

interface Mobile {
	default void m1() {
		System.out.println("Default Method");
	}
}

public class PrivateMethodExample2 implements Mobile {
	public void m1() {
		System.out.println("Overriding Method - My Own implementation");
	}

	public static void main(String[] args) {
		PrivateMethodExample2 example2 = new PrivateMethodExample2();
		example2.m1();

	}

}
