package CollectionJava;

import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapCollection {
	
	
	public static void treeMap() {
		
		System.out.println("Maintain Ascending Order");
		
   TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		
		map.put(1, "Shankar");
		map.put(1, "Shankarrao");
		map.put(5, "Shankar");
		map.put(2, "Pooja");
		map.put(4, "Pranita");
		map.put(6, null);
//		map.put(null, null);  null key not allowed
		
		System.out.println(map);
		printMap(map);
	}
	
	public static void hashMap() {
		
		System.out.println("Maintain NO Order");
		   HashMap<Integer, String> map = new HashMap<Integer, String>();//Default Size 16
			
			map.put(1, "Shankar");
			map.put(2, "aaaa");
			map.put(2, "Pooja");
			map.put(3, "Priyanka");
			map.put(4, "Pranita");
			map.put(6, null);
			map.put(null, null);
			System.out.println(map);
			Collection<String> c=map.values();
			System.out.println(Arrays.toString( c.toArray()));
			printMap(map);
		
	}
	
	public static void linkedHashMap() {
		System.out.println("Maintain Insertion Order");
		
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
			
			map.put(1, "Shankar");
			map.put(1, "Shankarrao");
			map.put(5, "Shankar");
			map.put(2, "Pooja");
			map.put(3, "Priyanka");
			map.put(4, "Pranita");
			map.put(6, null);
			map.put(null, null);
			
			System.out.println(map);
			
			printMap(map);
		
	}
	
	public static void printMap(Map<Integer, String> map) {
		
		//In Map Interface 3 Main Method 1)keySet() 2)entrySet() 3)values()
		
		System.out.println("Print Map Using Iterator");
        Iterator<Integer> itr= map.keySet().iterator();
		while (itr.hasNext()) {
			Integer key = itr.next();
			System.out.println(key+ " "+map.get(key));
			
		}
		
		System.out.println("Print Map Using Set - map.keySet()");
		Set<Integer> setOfKeys = map.keySet();
		
		for (Integer keys : setOfKeys) {
			System.out.println(keys+" "+map.get(keys));
		}
		
		System.out.println("Print Map Using Set - map.entrySet()");
		Set<Map.Entry<Integer, String>> setOfKeys1 = map.entrySet();
		System.out.println(setOfKeys1);
		
		System.out.println("Print Map Using Entry");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}

	public static void main(String[] args) {
		
		
		
		treeMap();
//		hashMap();
//		linkedHashMap();
		
		

	}

}
