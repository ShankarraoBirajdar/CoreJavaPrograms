package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiliteringExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> list =numbers.stream().collect(Collectors.filtering(n->n%2==0, Collectors.toList()));
		System.out.println(list);
	}

}
