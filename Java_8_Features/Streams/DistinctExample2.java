package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {

		if (obj==null) 
			return false;
		
		if (obj.getClass()!=this.getClass())
			return false;
		
		Person person = (Person) obj;
		return this.name.equals(person.name);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name);
	}
	
}

//distinct() internally use equals and hashcode method to validate the unique key
public class DistinctExample2 {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Shankar", 28));
		persons.add(new Person("Priyanka", 28));
		persons.add(new Person("Pooja", 26));
		persons.add(new Person("Pranita", 24));
		persons.add(new Person("Shankar", 28));
		persons.add(new Person("Shankar", 28));
		
		persons.stream().distinct().forEach(p->System.out.println(p.name+" "+p.age));

	}

}
