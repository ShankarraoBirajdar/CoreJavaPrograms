package Streams;

import java.util.Arrays;
import java.util.List;

public class MatchExample {

	public static void main(String[] args) {
		anyMatchMethod();
		allMatchMethod();
		noneMatchMethod();
	}

	// anyMatch take predicate if condition is matched its will return true
	// otherwise return false
	// but once condition is match it will not check next element
	// it will break the execution
	public static void anyMatchMethod() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		boolean isGreater = numbers.stream().anyMatch(n -> n > 10);
		boolean isEven = numbers.stream().anyMatch(n -> n % 2 == 0);

		System.out.println(isGreater);
		System.out.println(isEven);
	}

	// allMatch take predicate if condition is matched with all the elements then it
	// will return true
	// otherwise return false
	// it will perform operation on each element
	public static void allMatchMethod() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		boolean isGreater = numbers.stream().allMatch(n -> n > 0);
		boolean isEven = numbers.stream().allMatch(n -> n % 2 == 0);

		System.out.println(isGreater);
		System.out.println(isEven);
	}

	// noneMatch take predicate if condition is not matched with all the elements
	// then it will return true
	// otherwise return false
	// it will perform operation on each element
	public static void noneMatchMethod() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		boolean isGreater = numbers.stream().noneMatch(n -> n > 11);
		boolean isEven = numbers.stream().noneMatch(n -> n % 2 == 0);

		System.out.println(isGreater);
		System.out.println(isEven);
	}

}
