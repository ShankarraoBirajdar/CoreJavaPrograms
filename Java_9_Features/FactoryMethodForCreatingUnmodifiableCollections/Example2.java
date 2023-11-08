package FactoryMethodForCreatingUnmodifiableCollections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add(null);
		System.out.println("set: "+set);
		
		
		// until 1.8v to create immutable Set Object suppose to use
		// Collections.unmodifiableSet(set);
		Set<String> set1 = Collections.unmodifiableSet(set);
		try {
			set1.add("Pooja");// Not Allowed set1 is immutable - CE: java.lang.UnsupportedOperationException
			set1.remove("Pooja");// Not Allowed set1 is immutable - CE: java.lang.UnsupportedOperationException
		} catch (UnsupportedOperationException e) {
			System.out.println(e);
			System.out.println("set1: "+set1);
		}
		
		//1.9v to create immutable Set use   Set.of()
		Set<String> set2 = Set.of("A", "B", "C", "D");
		try {
			set2.add("E");// Not Allowed set2 is immutable - CE: java.lang.UnsupportedOperationException
			set2.remove("E");// Not Allowed set2 is immutable - CE: java.lang.UnsupportedOperationException
		} catch (UnsupportedOperationException e) {
			System.out.println(e);
			System.out.println("set2: " + set2);
		}

		System.out.println("set2: " + set2.getClass().getName()); // java.util.ImmutableCollections$SetN
		
		//Create empty  immutable Set Object
		Set<String> set4 = Set.of();
		System.out.println("set4: " + set4);

		// Create only 1 element immutable Set Object
		Set<String> set5 = Set.of("A");
		System.out.println("set5: " + set5);

		// 1 no param Set.Of() method
		// 10 param Set.Of() method
		// 1 vararg Set.Of() method
		// Total 12 Set.Of() method are available just to improve performance

		
		try {
			//1.9v Null value not accepted in immutable Set
			Set<String> set3 = Set.of("A", "B", "C", null); 
		} catch (NullPointerException e) {
			// CE: java.lang.NullPointerException
			System.out.println(e);
		}
		
		try {
			//Duplicates are not Allowed
			Set<String> set6 = Set.of("A", "B", "C", "A"); 
		} catch (IllegalArgumentException e) {
			//java.lang.IllegalArgumentException: duplicate element: A
			System.out.println(e);
		}
		
		
	}

}
