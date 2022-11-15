package TypeCastOperator;

class Parent {
	public void methodOne() {
      System.out.println("This is Parent Class methodOne Function");
	}
}

class Child extends Parent {
	public void methodOne() {
		 System.out.println("This is Child Class methodOne Function");
	}

	public void methodTwo() {
		 System.out.println("This is Child Class methodTwo Function");
	}
}

public class UpcastingDowncasting {

	public static void main(String[] args) {
		
		Parent parent = new Child();//Upcasting
		parent.methodOne();
		//parent.methodTwo();//Error
		
		Child child = (Child) parent;//Downcasting
		child.methodOne();
		child.methodTwo();

	}

}
