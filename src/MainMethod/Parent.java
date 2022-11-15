package MainMethod;

class Parent {
	public static void main(String[] args) {
		System.out.println("parent main"); // Parent.java
	}
}

class Child extends Parent {
	public static void main(String[] args) {
		System.out.println("Child main");
	}
}
