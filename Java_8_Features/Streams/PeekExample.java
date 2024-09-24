package Streams;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//It can be useful for debugging or logging, or for performing some kind of side effect on the stream elements.
//In Java 8, the peek method is a non-terminal operation that allows you to perform an action on each element of a stream as it passes through the pipeline
//The peek method takes a Consumer as its argument, which is a functional interface that takes a single argument and returns no result.
//The Consumer can be a lambda expression, method reference, or an instance of a class that implements the Consumer interface.
public class PeekExample {

	public static void main(String[] args) {

		int sum = IntStream.range(1, 6).peek(i -> System.out.println("Before map: " + i)).map(i -> i * i)
				.peek(i -> System.out.println("After map: " + i)).sum();

		System.out.println("SUM():: " + sum);

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

		Integer integer = stream.peek(i -> System.out.println("Before map: " + i)).map(i -> i * i)
				.peek(i -> System.out.println("After map: " + i)).collect(Collectors.summingInt(Integer::intValue));

		System.out.println("SUM():: " + integer);

	}

}
