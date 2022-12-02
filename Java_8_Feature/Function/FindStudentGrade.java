package Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;



public class FindStudentGrade {

	public static void main(String[] args) {
		
		Function<Student, String> function=s->{
			int marks=s.getMarks();
			if(marks>=80) {
				return "A[Distinct]";
			}else if(marks>=60) {
				return "B[First Class]";
			}else if(marks>=50) {
				return "C[Second Class]";
			}else if(marks>=35) {
				return "D[Third Class]";
			}else {
				return "E[Failed]";
			}
		};
		
		Predicate<Student> predicate=s->s.getMarks()>60;
		
		opertion(predicate,function,createData());
	}
	
	public static void opertion(Predicate<Student> predicate, Function<Student, String> function,ArrayList<Student> list) {
		for (Student student : list) {
			
			if(predicate.test(student)) {
				System.out.println("######################################");
				System.out.println("Student Name: "+student.getName());
				System.out.println("Student Mark: "+student.getMarks());
				System.out.println("Student Grade: "+function.apply(student));
			}
			
		}
	
	}
	
	public static ArrayList<Student> createData() {
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student("Shankar",80 ));
		list.add(new Student("Priyanka",75 ));
		list.add(new Student("Pooja",70 ));
		list.add(new Student("Onkar",75 ));
		list.add(new Student("Aman", 70));
		list.add(new Student("Divya",65 ));
		list.add(new Student("Dhaneshwari",60 ));
		list.add(new Student("Akansksha",55 ));
		list.add(new Student("Sherri",50 ));
		list.add(new Student("Sriranjani",45 ));
		list.add(new Student("Anubha",40 ));
		list.add(new Student("Sherri",35));
		list.add(new Student("Nishant",30 ));
		list.add(new Student("Akshay",25 ));
		
       return list;
	}

}

class Student{
	private String name;
	private int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", marks=" + marks + "]";
	}
	
}