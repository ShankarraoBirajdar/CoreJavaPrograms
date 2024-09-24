package Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReduceExample {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

		stream.map(I -> I * I).reduce((I1, I2) -> I1 + I2).ifPresent(I -> System.out.println("SUM():: " + I));

	}

}
