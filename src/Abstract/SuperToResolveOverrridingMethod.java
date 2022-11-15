package Abstract;

class Parent {
	void show() {
		System.out.println("Parent Class");
	}
}

class child extends Parent {
	void show() {
		super.show();
		System.out.println("Child Class");
	}
}

public class SuperToResolveOverrridingMethod {

	public static void main(String[] args) {
		child c = new child();
		c.show();

	}

}
