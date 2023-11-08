package DiamondOperatorEnhancements;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		//Generics
		
		ArrayList list = new ArrayList();//type not specified
		list.add("Shankar"); //not type safe
		list.add('A'); //not type safe
		list.add(10); //not type safe
		list.add(10.10); //not type safe
		list.add(true); //not type safe
		
		System.out.println(list);
//		String name  = list.get(0);//CE: Type mismatch: cannot convert from Object to String
		String name  = (String) list.get(0);//Type Casting
		
		//1.4v
		ArrayList<String> list2 = new ArrayList<String>();//type specified as String
		list2.add("Shankar");//type safe only String can add into list
		String name2  = list2.get(0);//Type Casting not required
		
		//1.7v
		ArrayList<String> list3 = new ArrayList<>();//<String> replace with <> diamond operator applicable only for normal class
		
		
		//1.9v
		// <> diamond operator applicable Anonymous class also
		
		//Example of  Anonymous class
		
		 // defining anonymous class
		Example1 example1 = new Example1() //<- child Anonymous class object - parent reference can hold child object
		{
			// body of the anonymous class
			public void name() {
				System.out.println("This is example of Anonymous class which extends Example1 class(parent)");
			}
		};
		System.out.println(example1.getClass().getName());//anonymous class name - DiamondOperatorEnhancements.Example1$1
		
		Runnable runnable = new Runnable() 
		{// created Anonymous class that implements implements implements 
			
			@Override
			public void run() {
				System.out.println("This is example of Anonymous class which implements implements implements");
				
			}
		};
		runnable.run();
	}

}
