package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByExample {

	public static void main(String[] args) {
		List<Persons> list = Arrays.asList(
				new Persons("Shankar", "Solapur"),
				new Persons("Amit", "Pune"),
				new Persons("Rahul", "Nashik")
				);
		
		Map<String, List<Persons>> map =list.stream().collect(Collectors.groupingBy(Persons::getCity));
		System.out.println(map);
		
		
		List<String> wordStrings = Arrays.asList("AAA","A","AAAAA","AAA","A","AAAA");
		
		Map<Integer, List<String>> countMap=wordStrings.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(countMap);
		
		Map<String, Long> countMap2=wordStrings.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(countMap2);
		
		Map<Integer, String> countMap3=wordStrings.stream().collect(Collectors.groupingBy(String::length,Collectors.joining("-")));
		System.out.println(countMap3);
	}

}

class Persons{
	String name;
	String city;
	
	public Persons(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "name=" + name;
	}	
}
