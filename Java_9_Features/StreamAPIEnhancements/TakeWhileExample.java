package StreamAPIEnhancements;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhileExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(6, 2, 1, 5, 4, 8);

		// filer method will perform operation on each element
		List<Integer> evenNo = numbers.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNo);

		// takeWhile method will perform operation one by on until condition failed or condition doesn't match
		// if anywhere condition false it will stop the execution
		List<Integer> evenNo2 = numbers.stream().takeWhile(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNo2);

		// dropWhile method will perform operation one by on after condition failed or condition doesn't match
		// if anywhere condition false it will start the execution
		List<Integer> evenNo3 = numbers.stream().dropWhile(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNo3);
		
		//1.8v iterate method with 2 arg
		Stream.iterate(1, x->x+1).limit(5).forEach(System.out::println);
		
		//1.9v iterate method with 3 arg
		Stream.iterate(11,x->x<=55, x->x+11).forEach(System.out::println);
		
		List<Integer> numbers2 = Arrays.asList(6, 2, 1,null, 5, 4, 8,null);
		System.out.println(numbers2);
		
		List<Integer> noNullValues = numbers2.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList());
		System.out.println(noNullValues);
	}

}
