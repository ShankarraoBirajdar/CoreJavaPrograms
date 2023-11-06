package Streams;

import java.util.ArrayList;

public class ForEachExamplesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("A");
		names.add("BB");
		names.add("CCC");
		
		names.stream().forEach(str->System.out.println(str));
		
		//replace with method reference
		names.stream().forEach(System.out::println);

	}

}
