package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingExample {
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple","banana","cherry");
		long count = words.stream().collect(Collectors.counting());
		System.out.println(count);
	}
}
