package Collection_Program;

import java.util.*;

public class Vector_Example {

	public static void main(String[] args)
	{
		Vector<Object> v=new Vector<Object>();
		System.out.println(v.capacity());
		
		for(int i=65;i<97;i++)
		{
			v.add((char)i);
		}
		System.out.println(v.capacity());
		v.add("A");
		System.out.println(v.capacity());
		System.out.println(v);

	}

}
