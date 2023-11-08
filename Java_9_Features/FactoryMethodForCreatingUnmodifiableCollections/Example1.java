package FactoryMethodForCreatingUnmodifiableCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add(null);
		System.out.println("list: " + list);
		// until 1.8v to create immutable list suppose to use
		// Collections.unmodifiableList(list);
		List<String> list2 = Collections.unmodifiableList(list);
		try {
			list2.add("Pooja");// Not Allowed list2 is immutable - CE: java.lang.UnsupportedOperationException
			list2.remove("Pooja");// Not Allowed list2 is immutable - CE: java.lang.UnsupportedOperationException
		} catch (UnsupportedOperationException e) {
			System.out.println(e);
			System.out.println("list2: " + list2);
		}
		// 1.9v to create immutable list use List.of()
		List<String> list3 = List.of("A", "B", "C", "D");
		try {
			list3.add("E");// Not Allowed list3 is immutable - CE: java.lang.UnsupportedOperationException
			list3.remove("E");// Not Allowed list3 is immutable - CE: java.lang.UnsupportedOperationException
		} catch (UnsupportedOperationException e) {
			System.out.println(e);
			System.out.println("list3: " + list3);
		}

		System.out.println("list3: " + list3.getClass().getName()); // java.util.ImmutableCollections$ListN

		// Create empty immutable list Object
		List<String> list5 = List.of();
		System.out.println("list5: " + list5);

		// Create only 1 element immutable list Object
		List<String> list6 = List.of("A");
		System.out.println("list6: " + list6);

		// 1 no param List.Of() method
		// 10 param List.Of() method
		// 1 vararg List.Of() method
		// Total 12 List.Of() method are available just to improve performance

		try {
			// 1.9v Null value not accepted in immutable list
			List<String> list4 = List.of("A", "B", "C", null); // CE: java.lang.NullPointerException
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
