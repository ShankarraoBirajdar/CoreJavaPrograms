package CollectionJava;

import java.util.*;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		DEFAULT_CAPACITY = 10;
//		int newCapacity = (oldCapacity * 3)/2 + 1;   JAVA 6
//		int newCapacity = oldCapacity + (oldCapacity >> 1)    JAVA 7
		List<String> list = new ArrayList<>();
	
		
		list.add("C");
		list.add("D");
	    list.add("J");
	    list.add("C");
		list.add("F");
		list.add("B");
		System.out.println(list.add("C"));
		
		System.out.println(list.get(3));
		System.out.println(list.set(3,"DD"));
		
		System.out.println(list.indexOf("C"));
		
		System.out.println(list.lastIndexOf("C"));
		
		System.out.println(list);
		
		Object[] str=list.toArray(); 
		System.out.println(Arrays.toString(str));
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		
	

	}

}
