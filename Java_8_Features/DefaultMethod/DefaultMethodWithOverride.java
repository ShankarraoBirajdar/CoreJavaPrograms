package DefaultMethod;

interface Laptop {
	default void m1() {
		System.out.println("Default Method");
	}
}
public class DefaultMethodWithOverride implements Laptop {

	public void m1() {
		System.out.println("My Own implementation!!!");
	}
	public static void main(String[] args) {
		DefaultMethodWithOverride de = new DefaultMethodWithOverride();
		de.m1();

	}

}
