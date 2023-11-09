package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountSkipLimitExampleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Shankar");
		names.add("Priyanka");
		names.add("Banashankari");
		names.add("Kedarnath");
		names.add("Adinath");
		names.add("Narayani");
		System.out.println("names: "+names);
		
		List<String> bigNames = names.stream().filter(str->str.length()>=8).collect(Collectors.toList());
		
		System.out.println("bigNames: "+bigNames);
		
		List<String> namesInUpperCase = names.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		
		System.out.println("namesInUpperCase: "+namesInUpperCase);
		
		Long count = names.stream().filter(str->str.length()>=8).count();
		System.out.println("The number of strings whose length >=8 : "+count);
		
		System.out.println("skip()");
		//it will skip first 2 elements
		names.stream().skip(2).forEach(System.out::println);
		System.out.println("limit()");
		//it will get only 3 elements 
		names.stream().limit(3).forEach(System.out::println);
		
		//it will skip first 2 elements and get 2 elements and stop the execution
		//remaining 2 element not processed
		System.out.println("skip()+limit()");
		names.stream().skip(2).limit(2).forEach(System.out::println);
		
	}

}
