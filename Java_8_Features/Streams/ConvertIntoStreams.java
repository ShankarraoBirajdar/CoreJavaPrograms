package Streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ConvertIntoStreams {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(a);
		IntStream.of(1,2,3,4,5);
		intStream.forEach(s->System.out.print(s+" "));
	    System.out.println();
		
		long[] b = {1,2,3,4,5};
		LongStream longStream = Arrays.stream(b);
		LongStream.of(1,2,3,4,5);
		longStream.forEach(s->System.out.print(s+" "));
	    System.out.println();
		
		double[] c = {1.1,2.2,3.3,4.4,5.5};
		DoubleStream doubleStream = Arrays.stream(c);
		DoubleStream.of(1,2,3,4,5);
		doubleStream.forEach(s->System.out.print(s+" "));
	    System.out.println();
		
		char[] ch = {'a','b','c','d','e','f','g'};
		Stream<Character> charStream = new String(ch).chars().mapToObj(i->(char)i);
		charStream.forEach(s->System.out.print(s+" "));
	    System.out.println();
		
		String str ="Shankar";
		Stream<String> charStream2 =str.chars().mapToObj(s->String.valueOf((char)s));
		charStream2.forEach(s->System.out.print(s+" "));
	    System.out.println();
	    
	    String[] strArray = {"Java","Laptop","Study","Stream"};
	    Stream<String> strStream = Arrays.stream(strArray);
	    strStream.forEach(s->System.out.print(s+" "));
	    System.out.println();
	    
		//List
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6);
	    Stream<Integer>	streamInteger=integers.stream();
	    streamInteger.forEach(s->System.out.print(s+" "));
	    System.out.println();
	    
	    List<Long> longs = Arrays.asList(1l,2l,3l,4l,5l,6l);
	    Stream<Long> streamLong=longs.stream();
	    streamLong.forEach(s->System.out.print(s+" "));
	    System.out.println();
	    
	    List<Double> doubles = Arrays.asList(1.1,2.2,3.3,4.4,5.5);
	    Stream<Double> streamDouble=doubles.stream();
	    streamDouble.forEach(s->System.out.print(s+" "));
	    System.out.println();
	    
	    List<Float> floats = Arrays.asList(1.1f,2.2f,3.3f,4.4f,5.5f);
	    Stream<Float> streamFloat=floats.stream();
	    streamFloat.forEach(s->System.out.print(s+" "));
	    System.out.println();
	    
	    List<Character> characters = Arrays.asList('a','b','c','d','e','f','g');
	    Stream<Character> streamCharacter=characters.stream();
	    streamCharacter.forEach(s->System.out.print(s+" "));
	    System.out.println();
	    
	    List<String> strings = Arrays.asList("Java","Laptop","Study","Stream");
	    Stream<String> streamString=strings.stream();
	    streamString.forEach(s->System.out.print(s+" "));
	    System.out.println();
	    
	    List<Boolean> booleans = Arrays.asList(true,false);
	    Stream<Boolean> streamBoolean=booleans.stream();
	    streamBoolean.forEach(s->System.out.print(s+" "));
	    System.out.println();
	    
	    //Set
	    Set<String> setStrings = new HashSet<>(Arrays.asList("Java","Laptop","Study","Stream","Java"));
	    Stream<String> streamSetStrings=setStrings.stream();
	    streamSetStrings.forEach(s->System.out.print(s+" "));
	    System.out.println();
	    
	    //Map
	    Map<String, String> myMap = new HashMap<String, String>() {{
	        put("a", "b");
	        put("c", "d");
	    }};
	    myMap.entrySet().stream().forEach(s->System.out.print(s.getKey()+" = "+s.getValue()+"\n"));
		
		
	}

}
