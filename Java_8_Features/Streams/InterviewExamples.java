package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewExamples {

	public static void main(String[] args) {

		getNoOfCharCount();
		findAllDuplicate();
		uniqueCharacters();
		firstNonRepeatCharacter();
		firstRepeatedCharacter();
		nThHighestNo(2);
		longestString();
		noStartsWith();
		reverseString();

	}

	public static void getNoOfCharCount() {
		// count the occurrence of each char in string
		String str = "ilovejavatechie";

		String[] strarray = str.split("");
		// convert to array

//		Map<String, Long> length = Arrays.stream(strarray)
//				.collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		Map<String, Long> length = Arrays.stream(strarray)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Occurrence of each character:: " + length);
	}

	public static void findAllDuplicate() {
		String str = "ilovejavatechie";

		String[] strarray = str.split("");

		Map<String, Long> length = Arrays.stream(strarray)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<Object, Object> allDuplicates = length.entrySet().stream().filter(l -> l.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println("All Duplicates characters:: " + allDuplicates);
	}

	public static void uniqueCharacters() {
		String str = "ilovejavatechie";

		String[] strarray = str.split("");

		Map<String, Long> length = Arrays.stream(strarray)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<Object, Object> uniqueElements = length.entrySet().stream().filter(l -> l.getValue() == 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println("All Unique characters:: " + uniqueElements);
	}

	public static void firstNonRepeatCharacter() {
		String str = "ilovejavatechie";

		String[] strarray = str.split("");

		Map<String, Long> length = Arrays.stream(strarray)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		String firstChar = length.entrySet().stream().filter(l -> l.getValue() == 1).findFirst().get().getKey();

		System.out.println("First Non Repeat Character:: " + firstChar);
	}

	public static void firstRepeatedCharacter() {

		String str = "ilovejavatechie";

		String[] strarray = str.split("");

		Map<String, Long> length = Arrays.stream(strarray)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		String firstChar = length.entrySet().stream().filter(l -> l.getValue() > 1).findFirst().get().getKey();

		System.out.println("First Repeated Character:: " + firstChar);
	}

	public static void nThHighestNo(int n) {
		int[] numbers = {5,9,11,2,8,21,1,11};
		
//		List<Integer> num=Arrays.stream(numbers).sorted().boxed().collect(Collectors.toList());
//		System.out.println(n+" Highest No :: "+num.get(num.size()-n));
		
//		List<Integer> num=Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).limit(1).collect(Collectors.toList());
		
		Integer num=Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(n+" Highest No :: "+num);
		
	}
	
	public static void longestString() {
		String[] strArray = {"Java","Techie","SpringBoot","Microservices"};
		

       Map<String, Integer> longest=Arrays.stream(strArray).collect(Collectors.toMap(Function.identity(),String::length));
       System.out.println(longest);
       
		String longestString = Arrays.stream(strArray).reduce((s1,s2)->s1.length()>s2.length()?s1:s2).get();
		System.out.println(longestString);
		
		int max = Arrays.stream(strArray).map(String::length).max(Integer::compareTo).get();
		System.out.println(max);


	}
	
	public static void noStartsWith() {
		int[] numbers = {5,9,11,2,8,21,1,100};
		
		List<String> list =Arrays.stream(numbers).boxed().map(s->s+"").filter(s->s.startsWith("1")).collect(Collectors.toList());
		System.out.println(list);
	}
	
	public static void reverseString() {
		String string = "Shankar";
        //Approach 1
		String reverseString=Stream.of(string).map(s-> new StringBuffer(s).reverse()).collect(Collectors.joining());
		System.out.println(reverseString);
		
		//Approach 2
		String reverseString2= string.chars().mapToObj(s->String.valueOf((char)s)).reduce((s1,s2)->s2+s1).orElse("");
		System.out.println(reverseString2);
		
	}

}
