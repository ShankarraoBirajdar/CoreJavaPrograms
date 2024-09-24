package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectingAndThen {

	public static void main(String[] args) {


		List<String> words = Arrays.asList("apple","banana","cherry","banana","apple","coconut");
		
		int size = words.stream().collect(Collectors.collectingAndThen(Collectors.toSet(), Set::size));
		System.out.println(size);
	}

}
