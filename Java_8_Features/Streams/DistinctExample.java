package Streams;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {

	public static void main(String[] args) {

		List<String>  languages = Arrays.asList("Java","C++","Python","Ruby","Java","JavaScript","Python","C#");
		//return unique values
		languages.stream().distinct().forEach(s->System.out.println(s));

	}

}
