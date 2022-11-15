package CollectionJava;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		identityHashMap();
		hashMap();

	}
	public static void identityHashMap() {
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		
		IdentityHashMap map=new IdentityHashMap<>();
		map.put(I1, "Shankar");
		map.put(I2, "Priyanka");
		
		System.out.println(map);
		
	}
	public static void hashMap() {
		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);
		
		HashMap map=new HashMap<>();
		map.put(I1, "Shankar");
		map.put(I2, "Priyanka");
		
		System.out.println(map);
	}

}
