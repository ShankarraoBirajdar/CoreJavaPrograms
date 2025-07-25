package CollectionJava;

import java.util.*;

public class ListCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		DEFAULT_CAPACITY = 10;
//		int newCapacity = (oldCapacity * 3)/2 + 1;   JAVA 6
//		int newCapacity = oldCapacity + (oldCapacity >> 1)    JAVA 7
		List<String> list = new ArrayList<>();
	
		
		list.add("A");
		list.add("B");
	    list.add("C");
	    list.add("D");
		list.add("E");
		list.add("A");
		
		System.out.println("---------add()--------");
		//add() always returns true - duplicates allowed & maintain insertion order
		System.out.println(list.add("c"));
		System.out.println(list.add("C"));
		System.out.println(list);
		System.out.println("---------get()--------");
		//get() Retrieves the element at the specified index in the list. 
		//Throws IndexOutOfBoundsException if the index is invalid.
		System.out.println(list.get(3));
		System.out.println(list);
		System.out.println("--------set()---------");
		//set() update new value and returns old value
		System.out.println(list.set(0,"aa"));
		System.out.println(list);
		System.out.println("--------indexOf()---------");
		//indexOf() Returns the first index where o.equals(elem) is true, or –1 if not found 
		System.out.println(list.indexOf("C"));
		System.out.println(list);
		System.out.println("---------lastIndexOf()--------");
		System.out.println(list.lastIndexOf("C"));
		System.out.println(list);
		System.out.println("----------toArray()-------");
		Object[] str=list.toArray(); 
		System.out.println(Arrays.toString(str));
		System.out.println("---------.addAll()--------");
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
		List<Integer> list3 = new ArrayList<>(Arrays.asList(11,12,13,14,15));
		
		System.out.println(list1.addAll(list2));
		System.out.println(list1);
		
		System.out.println(list2.addAll(0,list3));
		System.out.println(list2);
		System.out.println("-------------contains()----------------");
		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
		boolean hasApple = fruits.contains("apple");   // true
		boolean hasMango = fruits.contains("mango");   // false
		System.out.println(hasApple + ", " + hasMango);
		System.out.println("-------------containsAll()----------------");
		ArrayList<String> myList = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		List<String> subset = Arrays.asList("A", "C");
		List<String> nonSubset = Arrays.asList("A", "F");
		System.out.println(myList.containsAll(subset));         // true
		System.out.println(myList.containsAll(nonSubset));      // false
		System.out.println("----------------retainAll()-----------------");
		ArrayList<String> al1 = new ArrayList<>(Arrays.asList("pen", "pencil", "paper"));
		ArrayList<String> al2 = new ArrayList<>(Arrays.asList("pen", "paper", "books", "rubber"));
		System.out.println("Before: al2 = " + al2);
		boolean changed = al2.retainAll(al1);
		System.out.println("Changed? " + changed);
		System.out.println("After: al2 = " + al2);
		System.out.println("---------------remove()------------------");
//		Purpose: Removes the first occurrence of the specified element from the list.
//		Returns: true if the element was found and removed; false if the list did not contain it.
		List<String> fruits1 = new ArrayList<>(List.of("Apple", "Banana", "Cherry", "Banana"));
		boolean removed = fruits1.remove("Banana"); // removes the *first* "Banana"
		System.out.println(removed); // true
		System.out.println(fruits1);    // [Apple, Cherry, Banana]
		System.out.println("---------------removeAll()------------------");
//		Purpose: Removes all elements in the list that are also contained in the specified collection
//		Returns: true if the list was modified (i.e., at least one element removed), otherwise false.
		ArrayList<String> fruits2 = new ArrayList<>(List.of("Apple", "Banana", "Cherry", "Date"));
		fruits2.removeAll(List.of("Banana", "Date", "Fig"));
		System.out.println(fruits2); // [Apple, Cherry]
		System.out.println("---------------clear()------------------");
//		Purpose: Removes all elements from the list, resetting it to empty. 
//		Returns: void (no return value).
//		Performance: More efficient than removeAll() when clearing a list, as it doesn't involve containment checks. 
		List<String> listClear = new ArrayList<>(List.of("A", "B", "C"));
		listClear.clear();
		System.out.println(listClear); // []
		System.out.println("---------------removeIf(Predicate<? super E> filter)------------------");
//		It removes all elements in the collection that satisfy the given predicate .(i.e., for which the predicate returns true) 
		ArrayList<String> names = new ArrayList<>(List.of("Alice", "Sam", "Bob", "Sara"));
		names.removeIf(name -> name.startsWith("S"));
		System.out.println(names); // [Alice, Bob]
		System.out.println("---------------forEach()------------------");
		ArrayList<Integer> numbers = new ArrayList<>(List.of(5, 9, 8, 1));
		numbers.forEach(n -> System.out.print(n+" "));
		numbers.forEach(System.out::println);
		System.out.println("---------------subList()------------------");
		ArrayList<String> listSL = new ArrayList<>(List.of("A", "B", "C", "D", "E"));
		List<String> slice = listSL.subList(1, 4);
		System.out.println(slice); // [B, C, D]
		System.out.println("---------------isEmpty()------------------");
		ArrayList<String> listEmpty = new ArrayList<>();
		System.out.println(listEmpty.isEmpty()); // true
		listEmpty.add("Hello");
		System.out.println(listEmpty.isEmpty()); // false
		System.out.println("---------------equals()------------------");
		List<String> a = List.of("A", "B", "C");
		List<String> b = new ArrayList<>(List.of("A", "B", "C"));
		System.out.println(a.equals(b)); // true
		List<String> c = List.of("A", "C", "B");
		System.out.println(a.equals(c)); // false (order mismatch)
		System.out.println("---------------Enhanced for-loop------------------");
		List<String> names1 = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
		// Enhanced for-loop
        for (String name : names1) {
            System.out.println("Hi, " + name);
        }
		System.out.println("---------------iterator()------------------");
		Iterator<String> itr = names1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		
	

	}

}
