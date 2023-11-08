package FactoryMethodForCreatingUnmodifiableCollections;

import java.util.Map;

public class Example4 {

	public static void main(String[] args) {

		Map.Entry<Integer, String> entry = Map.entry(1, "Shankar");
		System.out.println(entry);
		
		try {
			entry.setValue("Priyanka");// Not Allowed entry is immutable - CE: java.lang.UnsupportedOperationException
		} catch (UnsupportedOperationException e) {
			System.out.println(e);
		}
		
		Map.Entry<Integer, String> entry1 = Map.entry(2, "Priyanka");
		Map.Entry<Integer, String> entry2 = Map.entry(3, "Narayani");
		
		// 1.9v to create immutable Entry use Map.ofEntries()
		Map<Integer, String> map = Map.ofEntries(entry,entry1,entry2);
		System.out.println(map);
		
		try {
			map.put(4, "Pooja");
		} catch (UnsupportedOperationException e) {
			System.out.println(e);
		}

	}

}
