package CollectionJava;
import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
		LinkedListMethod();

	}
	
	public static void LinkedListMethod() {
		
		LinkedList<String>  linkedList=new LinkedList<>();
		
		linkedList.add("Shankar");
		linkedList.add("Priyanka");
		linkedList.add("Aman");
		linkedList.add("pooja");
		linkedList.add("onkar");
		
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		linkedList.addFirst("Onkar");
		linkedList.addLast("Shankar");
		
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		linkedList.removeFirst();
		linkedList.removeLast();
		
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		
		Iterator<String> itr=linkedList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}
