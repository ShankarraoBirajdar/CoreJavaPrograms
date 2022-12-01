package LambdaExpression;

//It it a Anonymous Function
//Not Having Name
//Not Having Modifiers
//Not Having any Return Type

//If The Interface Contain Only One or Single Abstract Method Such Type of Interface Called Functional Interface
//Examples
//Runnable contain only run() method
//Callable contain only call() method
//Comparable contain only compareTo() method
//To indicate explicitly functional interface use above annotation @FunctionalInterface
@FunctionalInterface
interface ZeroParameter{
	public abstract void zeroParam();
	
	//Any No of Default Method is Allowed
	default void defaultMethod() {
		System.out.println("This is Default Method");
	}
	
	//Any No of Static Method is Allowed
		static void staticMethod() {
			System.out.println("This is Static Method");
		}
}

@FunctionalInterface
interface OneParameter{
	public abstract int oneParam(String str);
}

@FunctionalInterface
interface MultipleParameters {
	public abstract void multiParam(int a, int b);
}

public class App  {

	public static void main(String[] args) {
		System.out.println("java version: "+System.getProperty("java.version"));
		//to call Lambda Expression  we need Functional Interface is mandatory
		//In Function Body Contain only one Statement then Parenthesis not required
		
		ZeroParameter zeroParameter = () -> System.out.println("Zero parameter ");
		zeroParameter.zeroParam();
		
		zeroParameter.defaultMethod();
		ZeroParameter.staticMethod();
		
		OneParameter oneParameter = (p) -> {System.out.println("One parameter: " + p); return p.length();};
		oneParameter.oneParam("Shankar");
		
		MultipleParameters ab = (a, b)->System.out.println(a+b);
		ab.multiParam(10, 20);
		
//		System.out.println(addition(10, 20));
//		System.out.println(getLength("Shankar"));		
	}

	//Normal Function
	public static int addition(int a, int b) {
		return a + b;
	}
	
	public static int getLength(String str) {
		return str.length();
	}

}
