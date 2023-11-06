package PrivateMethod;


//without effecting implementation classes, if you want to add the new method to the interface,
//if you want to extend the functionality then you should go for default or static method
interface Device{
	default void m1() {
		System.out.println("Default Method");
	}
}
public class PrivateMethodExample1 implements Device {


	public static void main(String[] args) {
		
		PrivateMethodExample1 example1 = new PrivateMethodExample1();
		example1.m1();
	}

}
