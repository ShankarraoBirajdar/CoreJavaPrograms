package MethodHiding;

class Parents {
	public static void m1() {System.out.println("Static Method");}

	public void m2() {System.out.println("Public Modifier");}
}

class Childs extends Parents {
//	public void m1() {System.out.println("Non Static Method");}//This instance method cannot override the static method from Parent
//	private void m2() {System.out.println("private Modifier");}//Cannot reduce the visibility of the inherited method from Parents
}

public class App {

	public static void main(String[] args) {
		
		Parents.m1();
		
		Parents parents =new Childs();
		parents.m2();
		

	}

}
