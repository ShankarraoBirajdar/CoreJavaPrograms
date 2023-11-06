package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;


public class AuthenticationByUsingPredicate {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Username");
		String  username=scanner.next();
		System.out.println("Enter Password");
		String  password=scanner.next();
		
		Employee employee = new Employee(username, password);
		
		Predicate<Employee> predicate=user->user.getUsername().equals("shankar")&&user.getPassword().equals("java");
		
		validateAuthentication(predicate,employee);
		
	}
	public static void validateAuthentication(Predicate<Employee> predicate,Employee employee ) {
		if (predicate.test(employee)) {
			System.out.println("Valid Employee");
		}else {
			System.out.println("Invalid Employee");
		}

	}

}

class Employee{
	private String username;
	private String password;
	
	public Employee(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
