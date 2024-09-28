package MethodAndConstructorReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArbitraryObject {

//	Reference to an instance method of an arbitrary object of a particular type
	public static void main(String[] args) {


		// Creating an empty ArrayList of user defined type
        // List of person
        List<String> personList = new ArrayList<>();
 
        // Adding elements to above object of List
        // using add() method
        personList.add("vicky");
        personList.add("poonam");
        personList.add("sachin");
 
        // Method reference to String type
        Collections.sort(personList,
                         String::compareToIgnoreCase);
 
        // Printing the elements(names) on console
        personList.forEach(System.out::println);

	}

}
