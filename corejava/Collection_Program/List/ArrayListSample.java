package Collection_Program.List;

import java.util.*;

public class ArrayListSample {

	public static void main(String[] args)
	{
		ArrayList<Object> al=new ArrayList<Object>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  ArrayList<Object> al2=new ArrayList<Object>();
		  al2.add("Ravi");  
		  al2.add("Hanumat");
		  
		  ArrayList<Object> al3=new ArrayList<Object>();
		  al3.add(10);
		  al3.add(30);
		  al3.add(20);
		  al3.add(40);
		  Integer myArray[]=new Integer[al3.size()];
		  myArray=al3.toArray(myArray);
		  System.out.println(Arrays.toString(myArray));
		  
		  System.out.println(al.size());
		  
		  al.addAll(al2);
//		  al.removeAll(al2);/*remove all ravi*/
//		  al.retainAll(al2);/*retain all ravi*/
		  
//		  System.out.println(al.size());
//		  System.out.println(al.isEmpty());
		  
		  System.out.println("using Iterator");
		  Iterator<Object> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  }
		  
		  System.out.println("\n using foreach");
		  for(Object obj:al)  
			    System.out.println(obj);
		


	}

}
