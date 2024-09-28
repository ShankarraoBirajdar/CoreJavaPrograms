package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import InnerClass.variableAccessInnerClass;

public class InterviewExamples {

	public static void main(String[] args) {

//		getNoOfCharCount();
//		findAllDuplicate();
//		uniqueCharacters();
//		firstNonRepeatCharacter();
//		firstRepeatedCharacter();
//		nThHighestNo(2);
//		longestString();
//		noStartsWith();
//		reverseString();
		nthHighestSalary();
//		armstrong();
//		palindrome();
//		fibonacci();
//		commonElements();
//		printListOnLength();
//		anagram();

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
	
	public static void nthHighestSalary() {
		Map<String, Integer> map =  new HashMap<String, Integer>();
		map.put("Shankar", 1000);
		map.put("Priyanka", 1200);
		map.put("Aman", 1300);
		map.put("Onkar", 1400);
		map.put("Anil", 1500);
		map.put("Pooja", 1600);
		map.put("Amit", 1700);
		
		System.out.println(map.keySet());
		
		//Approch1
		int max=map.entrySet().stream().map(m->m.getValue()).max((m1,m2)->m1.compareTo(m2)).get();
		System.out.println(max);
		
		map.entrySet().stream().filter(v->v.getValue()==max).forEach(System.out::println);
		
		//Approch2
		Entry<String, Integer> sortByMap = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).collect(Collectors.toList()).get(0);
		System.out.println(sortByMap);
		
		Map<String, Integer> map2 =  new HashMap<String, Integer>();
		map2.put("Shankar", 1000);
		map2.put("Priyanka", 1300);
		map2.put("Aman", 1500);
		map2.put("Onkar", 1600);
		map2.put("Anil", 1000);
		map2.put("Pooja", 1300);
		map2.put("Amit", 1600);
		//Approch3
		Entry<Integer, List<String>> groupByMap = map2.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
				.entrySet()
				.stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.collect(Collectors.toList()).get(1);
		System.out.println(groupByMap);
	}
	
	public static void armstrong() {
		int no = 153;
		String s = Integer.toString(no); 
		int[] noArray = new int[s.length()];
		for (int i = 0; i < noArray.length; i++) {
			noArray[i] = Character.getNumericValue(s.charAt(i));
		}
		System.out.println(Arrays.toString(noArray));
		int value = Arrays.stream(noArray).boxed().map(n->n*n*n).collect(Collectors.summingInt(Integer::intValue));
		System.out.println(value);
	}

	public static void palindrome() {
		// palindrome
		String str = "NITIN";
//				IntStream.range(0, str.length()/2).forEach(System.out::println);

		str.chars().mapToObj(s1 -> String.valueOf((char) s1)).reduce((s1, s2) -> s2 + s1)
				.ifPresent(System.out::println);

		boolean isItPalindrome = IntStream.range(0, str.length() / 2).noneMatch(i -> str.charAt(i) != str.charAt(str.length() - i - 1));

		if (isItPalindrome) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
		
		int count=0;
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (str.charAt(i)==str.charAt(length - i - 1)) {
				count++;
//				System.out.println(str.charAt(i)+" "+str.charAt(str.length() - i - 1));
			}
				
		}
		
		if (length==count) {
			System.out.println(str + " is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}
	}
	
	public static void fibonacci () {
		// create a stream using iterate 
        Stream<Integer> stream 
            = Stream.iterate(1,i -> i <= 10, i -> i*2); 
  
        // print Values 
        stream.forEach(System.out::println); 
        
        
		 Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0]+f[1]})
         .limit(10)
         .map(f -> f[0])
         .forEach(i -> System.out.print(i+" "));
	}
	
	public static void commonElements() {
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
         
        list1.stream().filter(list2::contains).forEach(System.out::println);
	}
	
	public static void printListOnLength() {
//		Given a list of strings, sort them according to increasing order of their length?
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        
        listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}
	
	public static void anagram() {
		String s1 = "listen";
	    String s2 = "silent";
	    
	    s1=s1.chars().mapToObj(s->String.valueOf((char)s)).sorted().collect(Collectors.joining());
	    s2=s2.chars().mapToObj(s->String.valueOf((char)s)).sorted().collect(Collectors.joining());
	    System.out.println(s1+" "+s2+" "+s1.equals(s2));
	    
	    s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        
        s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
         
        if (s1.equals(s2)) 
        {
            System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two strings are not anagrams");
        }
        
        int count=0;
        int s1Length = s1.length();
        int s2Length = s2.length();
        for (int i = 0; i <s1Length; i++) {
			for (int j = 0; j < s2Length; j++) {
				if (s1.charAt(i)==s2.charAt(j)) {
					count++;
					System.out.println(s1.charAt(i)+" "+s2.charAt(j));
					break;
				}
				
			}
		}
        
        if (count==s1Length) {
        	 System.out.println("Two strings are anagrams");
        }
        else
        {
            System.out.println("Two strings are not anagrams");
        }
		
	}
}
