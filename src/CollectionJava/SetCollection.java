package CollectionJava;

import java.util.Iterator;

import java.util.*;

public class SetCollection {
	
	
public static void main(String[] args) {
		
		HashSet();
		TreeSet();

	}
	
	public static void TreeSet() {
//		Set<String> set = new TreeSet<String>();
//		set.add("A");
//		set.add("F");
//		set.add("B");
//		set.add("D");
//		set.add("E");
//		set.add("C");
		
		Set<Integer> set = new TreeSet<Integer>();
		set.add(5);
		set.add(3);
		set.add(7);
		set.add(9);
		set.add(1);
		set.add(6);
//		set.add(null);  Null insertion is not possible
		
		
		System.out.println("=================Tree Set===============");
		System.out.println(set);
		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

	public static void HashSet() {
//		Set<String> set = new HashSet<String>();
//		set.add("A");
//		set.add("F");
//		set.add("B");
//		set.add(null);
//		set.add("D");
//		set.add("E");
//		set.add("C");
//		set.add(null);
		
		Set<Integer> set = new HashSet<Integer>();
		System.out.println(set.add(5));
		set.add(3);
		set.add(7);
		set.add(9);
		set.add(1);
		set.add(6);
		set.add(null);
		
		System.out.println("=================Hash Set===============");
		System.out.println(set);
		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}
	
	

}
