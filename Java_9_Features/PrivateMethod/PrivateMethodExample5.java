package PrivateMethod;

//if multiple default that is having some common code.
//Separate that common code into the private method and call that private method
//Wherever that common code is required.
//So what is the need of private method inside the interface code?
//Reusability Purpose.

interface Windows{
	static void m1() {
		System.out.println("m1() specific code");
		 m3();
	}
	static void m2() {
		System.out.println("m1() specific code");
		 m3();
	}
	private static void m3() {
		System.out.println("Common Code");
	}
}
public class PrivateMethodExample5 {

	public static void main(String[] args) {

		Windows.m1();
		Windows.m2();

	}

}
