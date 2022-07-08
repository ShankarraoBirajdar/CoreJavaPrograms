package Collection_Program;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
public class NavigableExample {

	public static void main(String[] args) throws Exception {
	    NavigableSet<Object> ns = new TreeSet<>();
		
       
	    ns.add(0);
	    ns.add(1);
	    ns.add(2);
	    ns.add(3);
	    ns.add(4);
	    ns.add(5);
	    ns.add(6);

	    // Get a reverse view of the navigable set
	    NavigableSet<Object> reverseNs = ns.descendingSet();

	    // Print the normal and reverse views
	    System.out.println("Normal order: " + ns);
	    System.out.println("Reverse order: " + reverseNs);

	    Iterator <Object> d= ns.descendingIterator();

	    while(d.hasNext())

	    {
	
	    	System.out.println(d.next());

	    }

	    
	    NavigableSet<Object> threeOrMore = ns.tailSet(3, true);
	    System.out.println("3 or  more:  " + threeOrMore);
	    System.out.println("lower(3): " + ns.lower(3));
	    System.out.println("floor(3): " + ns.floor(3));
	    System.out.println("higher(3): " + ns.higher(3));
	    System.out.println("ceiling(3): " + ns.ceiling(3));

	    System.out.println("pollFirst(): " + ns.pollFirst());
	    System.out.println("Navigable Set:  " + ns);

	    System.out.println("pollLast(): " + ns.pollLast());
	    System.out.println("Navigable Set:  " + ns);

	    System.out.println("pollFirst(): " + ns.pollFirst());
	    System.out.println("Navigable Set:  " + ns);

	    System.out.println("pollFirst(): " + ns.pollFirst());
	    System.out.println("Navigable Set:  " + ns);

	    System.out.println("pollFirst(): " + ns.pollFirst());
	    System.out.println("Navigable Set:  " + ns);

	    System.out.println("pollFirst(): " + ns.pollFirst());
	    System.out.println("pollLast(): " + ns.pollLast());
	  }

}
