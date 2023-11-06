package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CountExampleApp {

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
		
	}

}
