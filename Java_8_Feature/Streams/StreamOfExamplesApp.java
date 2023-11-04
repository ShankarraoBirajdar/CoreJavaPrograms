package Streams;

import java.util.stream.Stream;

public class StreamOfExamplesApp {

	public static void main(String[] args) {


		Stream<Integer> stream = Stream.of(10,30,56,78,34,80,14);
		stream.forEach(System.out::println);
		
		Double[] points= {10.12,30.45,56.89,78.54,34.59,80.01,14.52};
		Stream<Double> streamDouble = Stream.of(points);
		streamDouble.forEach(System.out::println);
	}

}
