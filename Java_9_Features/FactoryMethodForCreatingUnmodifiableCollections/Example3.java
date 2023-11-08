package FactoryMethodForCreatingUnmodifiableCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Example3 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("A", "Apple");
		map.put("B", "Banana");
		map.put("C", "Cat");
		map.put("E", null);
		map.put(null, null);

		map.forEach((k, v) -> System.out.println(k + " " + v));

		// until 1.8v to create immutable Map Object suppose to use
		// Collections.unmodifiableMap(map);
		Map<String, String> map2 = Collections.unmodifiableMap(map);
		try {
			map2.put("D", "Dog");// Not Allowed map2 is immutable - CE: java.lang.UnsupportedOperationException
			map2.remove("D");// Not Allowed map2 is immutable - CE: java.lang.UnsupportedOperationException
		} catch (UnsupportedOperationException e) {
			System.out.println(e);
			System.out.println("map2: " + map2);
		}

		// 1.9v to create immutable Map use Map.of()
		Map<String, String> map3 = Map.of("A", "Apple", "B", "Banana", "C", "Cat", "D", "Dog");
		try {
			map3.put("D", "Dog");// Not Allowed map3 is immutable - CE: java.lang.UnsupportedOperationException
			map3.remove("E");// Not Allowed map3 is immutable - CE: java.lang.UnsupportedOperationException
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("map3: " + map3);
		}

		System.out.println("map3: " + map3.getClass().getName()); // java.util.ImmutableCollections$MapN

		// Create empty immutable Map Object
		Map<String, String> map4 = Map.of();
		System.out.println("map4: " + map4);

		// Create only 1 element immutable Map Object
		Map<String, String> map5 = Map.of("A", "Apple");
		System.out.println("map5: " + map5);

		// 1 no param Map.Of() method
		// 10 param Map.Of() method
		// 1 vararg Map.Of() method
		// Total 12 Map.ofEntries() method are available just to improve performance

		try {
			// 1.9v Null value not accepted in immutable Map
			Map<String, String> map6 = Map.of("A", "Apple", "B", null, null, null);
		} catch (NullPointerException e) {
			// CE: java.lang.NullPointerException
			System.out.println(e);
		}

		try {
			// Duplicates are not Allowed
			Map<String, String> map7 = Map.of("A", "Apple", "B", "Banana", "A", "Cat", "D", "Dog");
		} catch (IllegalArgumentException e) {
			// java.lang.IllegalArgumentException: duplicate element: A
			System.out.println(e);
		}

	}

}
