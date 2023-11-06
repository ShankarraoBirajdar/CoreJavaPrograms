package Streams;

import java.util.ArrayList;

public class ToArrayExamplesApp {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(10);
		numbers.add(20);
		numbers.add(5);
		numbers.add(15);
		numbers.add(25);
		System.out.println("numbers: "+numbers);
		
		Integer[] array = numbers.stream().toArray(Integer[]::new);
		
		for (Integer integer : array) {
			System.out.println(integer);
		}

	}

}
