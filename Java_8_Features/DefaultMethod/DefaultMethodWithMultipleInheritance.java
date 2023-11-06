package DefaultMethod;

import pattern.model1;

interface Left{
	default void m1() {
		System.out.println("Left Default Method");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right Default Method");
	}
}
public class DefaultMethodWithMultipleInheritance implements Left, Right {

	public void m1() {
		System.out.println("My Own implementation!!!");
		Left.super.m1();
	}
	public static void main(String[] args) {
		// Duplicate default methods named m1 with the parameters () and () are inherited from the types Right and Left
		DefaultMethodWithMultipleInheritance g=new DefaultMethodWithMultipleInheritance();
		g.m1();
		

	}

}
