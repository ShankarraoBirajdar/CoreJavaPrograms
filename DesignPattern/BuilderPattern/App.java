package BuilderPattern;

public class App {

	public static void main(String[] args) {
		// Create the object of builder
		Employee.EmployeeBuilder builder = new Employee.EmployeeBuilder();

		// Case 1: Create employee object with name , age , address
		Employee employee1 = builder.name("John").age(26).address("House no 123,gilbert street").build();

		// Case 2: Create employee object with name and age
		Employee employee2 = builder.name("Rakesh").age(24).build();

		// Case 3 : Create employee object with all parameters
		Employee employee3 = builder.name("Mukesh").age(27).address("House no 123,gilbert street").phoneNo("7676453321")
				.build();
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);

	}

}
