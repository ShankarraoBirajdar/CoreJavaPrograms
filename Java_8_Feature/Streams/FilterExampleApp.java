package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExampleApp {

	public static void main(String[] args) {
		//If I want to, I want to filter elements based on some boolean condition.
		//Then we should go for filter
		
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
			if (integer % 2 ==0) {
				evenNumbers.add(integer);
			}
		}
		
		System.out.println(evenNumbers);
		
		//print only even number using stream concept

		List<Integer> evenNumbersWithStream = numbers.stream().filter(I->I%2==0).collect(Collectors.toList());
		System.out.println(evenNumbersWithStream);
	}

}
