package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxExamplesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(10);
		numbers.add(20);
		numbers.add(5);
		numbers.add(15);
		numbers.add(25);

		System.out.println("numbers: " + numbers);
		// Default natural sorting order
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

		// min
		Integer min = numbers.stream().min((I1, I2) -> I1.compareTo(I2)).get();

		System.out.println("Minimum  Value : " + min);

		// max
		Integer max = numbers.stream().max((I1, I2) -> I1.compareTo(I2)).get();

		System.out.println("Maximum  Value : " + max);

	}

}
