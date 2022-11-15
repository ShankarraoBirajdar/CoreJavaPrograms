package DesignPattern;

class Student{
	private String name;
	private int age;
	private String city;
	
	private Student() {
	
	}
	
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	public Student setAge(int age) {
		this.age = age;
		return this;
	}
	public Student setCity(String city) {
		this.city = city;
		return this;
	}
	
	public static Student build() {
		return new Student();
	}
	
	
}
public class BuilderTest {

	public static void main(String[] args) {
		
		Student.build().setName("Shankar").setAge(28).setCity("Solapur");

	}

}
