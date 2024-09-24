package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		Map<Boolean, List<Integer>> map = numbers.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		System.out.println(map);

		Map<Boolean, Long> map2 = numbers.stream().collect(Collectors.partitioningBy(num -> (num > 3), Collectors.counting()));
		System.out.println(map2);

	}

}
