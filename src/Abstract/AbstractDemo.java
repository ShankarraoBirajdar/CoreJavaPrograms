  package Abstract;

interface f {
	abstract void AbstractMethod();
}

abstract class AbstractClass11 implements f {
	void nonAbstractMethod() {
		System.out.println("Inside Non Abstract Method");
	}

	public abstract void AbstractMethod();
}

class NextClass extends AbstractClass11 {
	void nextClassMethod() {
		System.out.println("Inside Next Class Method");
	}

	public void AbstractMethod() {
		System.out.println("Inside Abstract Method()");
	}
}

public class AbstractDemo {

	public static void main(String... args) {

		AbstractClass11 a = new NextClass();
		a.nonAbstractMethod();
		a.AbstractMethod();
		NextClass n = new NextClass();
		n.nextClassMethod();
		n.AbstractMethod();

	}

}
