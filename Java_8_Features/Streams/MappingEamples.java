package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingEamples {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("apple","banana","cherry");
//		List<Integer> words2 = words.stream().collect(Collectors.mapping(String::length,Collectors.toList()));
		List<Integer> words2 = words.stream().collect(Collectors.mapping(s->s.length(),Collectors.toList()));
		System.out.println(words2);
		
		
		//Mapping with downstream collector
		
		int totalLength =  words.stream().collect(Collectors.mapping(s->s.length(),Collectors.summingInt(Integer::intValue)));
		System.out.println(totalLength);
	}

}
