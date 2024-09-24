package LambdaExpressionWithFunctionalInterface;


//Functional Interface With Inheritance

//Case 1: If Parent Functional Interface Contain One abstract Method and Child Functional Interface contain no abstract Method - its Allowed
//Case 2: Parent Functional Interface abstract Method name, Signature and type should be same in Child Functional Interface Method   - its Allowed
//Case 3 Parent Functional Interface abstract Method name, Signature and type should not Matching with Child Functional Interface - its Not Allowed
@FunctionalInterface
interface Parent{
	public abstract void m1();
}

@FunctionalInterface
interface Child extends Parent{
	public abstract void m1();
}

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent parent = () -> System.out.println("This is Parent Interface");
		parent.m1();
		
		Child child = () -> System.out.println("This is Child Interface");
		child.m1();
	}

}
