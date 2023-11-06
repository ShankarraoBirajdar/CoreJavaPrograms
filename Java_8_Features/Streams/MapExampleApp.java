package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExampleApp {

	public static void main(String[] args) {
		//If you want to create separate new object for every object present in the collection,
		//then we should go for mapping mechanism.
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(10);
		numbers.add(20);
		numbers.add(5);
		numbers.add(15);
		numbers.add(25);
		System.out.println("numbers: "+numbers);
		
		//print only even number with out using stream concept
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		for (Integer integer : numbers) {
				evenNumbers.add(integer*2);
		}
		
		System.out.println(evenNumbers);
		
		//print only even number using stream concept

		List<Integer> evenNumbersWithStream = numbers.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println(evenNumbersWithStream);

	}

}
