package PrimitiveTypeFunctionalInterface;

import java.util.ArrayList;

public class Autoboxing {

	public static void main(String[] args) {


		//Convert int Primitive to Integer Wrapper Object is Call AutoBoxing
		//Before Java 1.5 Version i.e 1.4 For AutoBoxing you have to use valueOf()
		Integer i1=Integer.valueOf(10);
		//Convert Integer Wrapper Object to int Primitive is Call AutoUnboxing
		//Before Java 1.5 Version i.e 1.4  For AutoUnboxing you have to use intValue()
		int x1=i1.intValue();
		
		System.out.println(i1+"="+x1);
		
		//From Java 1.5 Version For AutoBoxing you don't need to use any function for conversion Complier will take take of this
		Integer i2=10;
		//From Java 1.5 Version For AutoUnboxing you don't need to use any function for conversion Complier will take take of this
		int x2=i2;
		
		System.out.println(i2+"="+x2);
		
		//Here Integer is Generic Type Parameter 
		//Only Allowed Type are Wrapper Class Object Only
		//Primitive Type Is  Not Allowed
		ArrayList<Integer> list = new ArrayList<Integer>();

	}

}
