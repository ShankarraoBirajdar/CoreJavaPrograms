package PrivateMethod;

interface Left{
	default void m1() {
		System.out.println("Default method of left interface");
	}
}

interface Right{
	default void m1() {
		System.out.println("Default method of right interface");
	}
}

public class PrivateMethodExample3 implements Left,Right {
	
	@Override
	public void m1() {
		
		Left.super.m1();
		Right.super.m1();
		
		System.out.println("My Own Implementation");
	}
	
	public static void main(String[] args) {
		PrivateMethodExample3 example3= new PrivateMethodExample3();
		example3.m1();

	}

}
