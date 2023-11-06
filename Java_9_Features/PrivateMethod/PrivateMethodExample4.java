package PrivateMethod;

//if multiple default that is having some common code.
//Separate that common code into the private method and call that private method
//Wherever that common code is required.
//So what is the need of private method inside the interface code?
//Reusability Purpose.

interface Bag{
	default void m1() {
		System.out.println("m1() specific code");
		 m3();
	}
	default void m2() {
		System.out.println("m1() specific code");
		 m3();
	}
	private void m3() {
		System.out.println("Common Code");
	}
}
public class PrivateMethodExample4 implements Bag {

	public static void main(String[] args) {
		PrivateMethodExample4 example4=new PrivateMethodExample4();
		example4.m1();
		example4.m2();
		

	}

}
