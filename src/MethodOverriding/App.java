package MethodOverriding;

class Parent{
	int a=10;
	public void MethodOne() {
		System.out.println("This is MethodOne From Parent Class");
	}
}

class Child extends Parent{
	int a=20;
	public void MethodOne() {
		System.out.println("This is MethodOne From child Class");
	}
	public void MethodTwo() {
		System.out.println("This is MethodTwo From child Class");
	}
}

public class App {

	public static void main(String[] args) {
		int a=30;
		Parent parent = new Child();
		parent.MethodOne();
//		parent.MethodTwo();
		System.out.println(parent.a);
		
		Child child = new Child();
		child.MethodOne();
		child.MethodTwo();
		System.out.println(child.a);
				 

	}

}
