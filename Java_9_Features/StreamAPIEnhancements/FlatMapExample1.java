package StreamAPIEnhancements;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExample1 {

	//map()
	//The function passed to map() operation returns a single value for a single input
	//One-to-one mapping occurs in map().
	
	//flatMap()
	//The function you pass to flatmap() operation returns an arbitrary number of values as the output.
	//One-to-many mapping occurs in flatMap().
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(list);
		
		//Square of each list element
		List<Integer> sqList = list.stream().map(I->I*I).collect(Collectors.toList());
		System.out.println(sqList);
		
		//Square and cube of each list element
		List<Integer> sqCubeList = list.stream().flatMap(I -> Stream.of(I * I, I * I * I)).collect(Collectors.toList());
		System.out.println(sqCubeList);

		//If number is Even then return empty else return number and number * 10 
		List<Object> list2 = list.stream().flatMap(x -> {
			if (x % 2 == 0)
				return Stream.empty();
			else
				return Stream.of(x, x * 10);
		}).collect(Collectors.toList());
		System.out.println(list2);

	}

}
