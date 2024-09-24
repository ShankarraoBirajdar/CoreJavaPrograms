package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
