package MethodAndConstructorReference;

interface Laptop{
	public void m1();
}

//If you don't want to implement m1 method and want to use this m2 method for m1 purpose.
//Then we should go for Method reference
//Condition 1: Compulsory should have same argument type(both method)
//biggest advantage : code reusability
//Method Reference  is alternative syntax to lambda expression
// syntax for static
//ClassName :: Method name
//syntax for Instance
//Object Reference :: Method name
//::  double colon operator
public class MethodReferenceByDoubleColon {
	
	public static void m2() {
		System.out.println("Method Reference with staic");
	}
	
	public void m3() {
		System.out.println("Method Reference with instance");
	}

	public static void main(String[] args) {


		Laptop laptop = MethodReferenceByDoubleColon::m2;//just refer m1() to m2()
		laptop.m1();

		MethodReferenceByDoubleColon m=new MethodReferenceByDoubleColon();
		Laptop laptop2 = m::m3;
		laptop2.m1();
	}

}
