package com.hp.shankar.corejavaPrograms;

public class StringImmutable {

	public static void main(String[] args) {

		//Once we creates a String Object, we can't perform any changes in the existing object
		//if we are trying to perform any change with those changes new object will be created 
		//String is Immutable its won't change
		String str = "Durga";
	
		str.concat("Software");//created new Object but it will go Garbage Collection
		
		System.out.println(str.concat("Software"));//created new Object but it will go Garbage Collection
		
		System.out.println(str);//String is Immutable its won't change
		
		
		
		
	
		String s1 = new String("Durga");
		String s2 = new String("Durga");
		
		System.out.println(s1==s2);//false //Reference Comparison
		System.out.println(s1.equals(s2));//true //Content Comparison equals() overridden from Object Class and implemented in String class
		
		StringBuffer sb= new StringBuffer("Durga");
		StringBuffer sb2= new StringBuffer("Durga");
		
		System.out.println(sb==sb2);//false //Reference Comparison
		System.out.println(sb.equals(sb2));//false //Reference Comparison // equals() using from Object  - no overridden

	}

}
