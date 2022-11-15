package GarbageCollector;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapExample {
	
	public static void weakHashMap() throws InterruptedException {
		WeakHashMap map = new WeakHashMap<>();
		WeakHashMapExample test = new WeakHashMapExample();
		map.put(test, "durga");
		
		System.out.println(map);
		
		test=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);
	}
	
    public static void hashMap()throws InterruptedException {
    	HashMap map = new HashMap<>();
		WeakHashMapExample test = new WeakHashMapExample();
		map.put(test, "durga");
		
		System.out.println(map);
		
		test=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(map);//GC don't destroy Hashmap Object
	}
	
	
	public void finalize() {
		System.out.println("finalize method Called");
	}

	public static void main(String[] args) throws InterruptedException {
	
		weakHashMap();
		hashMap();
		
		

	}

}
