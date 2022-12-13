package DefaultMethod;


//Default methods also known as defender methods or virtual extension methods.
//The main advantage of default methods is without effecting implementation classes we can
//add new functionality to the interface (backward compatibility).
interface Interf {
	default void m1() {
		System.out.println("Default Method");
	}
}

class Test implements Interf {
	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
