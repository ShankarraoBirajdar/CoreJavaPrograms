package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExamplesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(10);
		numbers.add(20);
		numbers.add(5);
		numbers.add(15);
		numbers.add(25);
		
		System.out.println("numbers: "+numbers);
		//Default natural sorting order
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		
		System.out.println("List according to default sorting order: "+sortedNumbers);
		
		//Customized natural sorting order
		List<Integer> customizedSortedNumbers = numbers.stream().sorted((I1,I2)->I2.compareTo(I1)).collect(Collectors.toList());
//		List<Integer> customizedSortedNumbers = numbers.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList());
		System.out.println("List according to customized sorting order: "+customizedSortedNumbers);
	}

}
