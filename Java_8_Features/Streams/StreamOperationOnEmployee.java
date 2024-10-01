package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamOperationOnEmployee {

	static List<Employee> employees = Arrays.asList(
			new Employee(1, "Daniel", 29, "IT", "Mumbai", 20000, "Male"),
			new Employee(2, "Mary", 27, "Sales", "Chennai", 25000, "Female"),
			new Employee(3, "Joe", 28, "IT", "Chennai", 22000, "Male"),
			new Employee(4, "John", 29, "Sales", "Gurgaon", 29000, "Male"),
			new Employee(5, "Liza", 25, "Sales", "Bangalore", 32000, "Female"),
			new Employee(6, "Peter", 27, "Admin", "Mumbai", 31500, "Male"),
			new Employee(7, "Harry", 30, "Research", "Kochi", 21000, "Male")
			);
	
	public static void main(String[] args) {

        //Find list of employees whose name starts with alphabet J
		
		List<Employee> listOfEmployees = employees.stream().filter(s->s.getName().startsWith("J")).collect(Collectors.toList());
		System.out.println(listOfEmployees);
		
		//Group The employees By Department Names
		Map<Object, List<Employee>> listOfEmpByDept = employees.stream().collect(Collectors.groupingBy(emp->emp.getDepartNames(),Collectors.toList()));
		listOfEmpByDept.forEach((k,v)->System.out.println(k+" "+v));
		
		//Find the total count of employees using stream
		Long noOfEmp =employees.stream().count();
//		Long noOfEmp =employees.stream().collect(Collectors.counting());
		System.out.println(noOfEmp);
		
//		Find the max age of employees
		int maxAge = employees.stream().map(emp->emp.getAge()).max((age1,age2)->age1.compareTo(age2)).get();
		int minAge = employees.stream().map(emp->emp.getAge()).min((age1,age2)->age1.compareTo(age2)).get();
//		int maxAge = employees.stream().mapToInt(emp->emp.getAge()).max().getAsInt();
//		int minAge = employees.stream().mapToInt(emp->emp.getAge()).min().getAsInt();
//		
		System.out.println(maxAge);
		System.out.println(minAge);
		
//		Find all department names
		List<String> listOfDeptName = employees.stream().map(emp->emp.getDepartNames()).collect(Collectors.toList());
		System.out.println(listOfDeptName);
		
//		Find the count of employee in each department
		Map<String, Long> noOfEmpInDept= employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames, Collectors.counting()));
		System.out.println(noOfEmpInDept);
		
//		Find the list of employees whose age is less than 30
		List<Employee> listOfEmpbelow30 = employees.stream().filter(emp->emp.getAge()<30).collect(Collectors.toList());
		System.out.println(listOfEmpbelow30);
		
//		Find the list of employees whose age is in between 26 and 31
		List<Employee> listOfEmpbet2631 = employees.stream().filter(emp->emp.getAge()>26&&emp.getAge()<31).collect(Collectors.toList());
		System.out.println(listOfEmpbet2631);
		
//		Find the average age of male and female employee
		Map<String, Double> avgOfAge = employees.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(emp->emp.getAge())));
		System.out.println(avgOfAge);
		
		//Find the department who is having maximum number of employee
		Entry<String, Long> deptMaxNoEmp=employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartNames,Collectors.counting()))
			.entrySet()
			.stream()
			.max(Map.Entry.comparingByValue()).get();
		
		System.out.println(deptMaxNoEmp);
		
//		Find the Employee who stays in Mumbai and sort them by their names
//		List<String> mumbaiEmp =employees.stream().filter(emp->emp.getAddress().equals("Mumbai")).map(emp->emp.getName()).sorted().collect(Collectors.toList());
		 List<Employee> mumbaiEmp = employees.stream().filter(emp -> emp.getAddress().equals("Mumbai")).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
				
		System.out.println(mumbaiEmp);
		
		
//		Find the average salary in all departments
		Map<String, Double> avgSalaryByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames,Collectors.averagingDouble(emp->emp.getSalary())));
		System.out.println(avgSalaryByDept);
		
//		Find the highest salary in each department
		Map<String, Optional<Employee>> a = employees.stream().collect(Collectors.groupingBy(Employee::getDepartNames,Collectors.minBy(Comparator.comparing(Employee::getSalary))));
		System.out.println(a);
		
//		Find the list of employee and sort them by their salary
		List<Employee> emps = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		System.out.println(emps);
		
//		Find the employee who has second highest salary
		Employee emp = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst().get();
		System.out.println(emp);
	}

}
