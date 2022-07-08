package Collection_Program;

import java.util.Hashtable;

public class HashTable_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable obj = new Hashtable();
		obj.put("A", new Integer(3));
		obj.put("B", new Integer(2));
		 obj.put("C", new Integer(8));
		 obj.remove(new String("A"));
		 System.out.print(obj);

	}

}
