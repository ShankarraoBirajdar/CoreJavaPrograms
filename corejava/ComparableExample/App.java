package ComparableExample;

public class App {

	public static void main(String[] args) {

		Employee employee = new Employee(0, "Shankar");
		Employee employee1 = new Employee(1, "Amit");
		Employee employee2 = new Employee(2, "Aman");
		Employee employee3 = new Employee(3, "Rahul");
		Employee employee4 = new Employee(4, "Ashok");
		Employee employee5 = new Employee(5, "Durgesh");
		
		System.out.println(employee);
		
		//0 - zero
		System.out.println(employee1.compareTo(employee1));
		
		//-ve
		System.out.println(employee.compareTo(employee1));
		System.out.println(employee2.compareTo(employee3));
		System.out.println(employee3.compareTo(employee4));
		System.out.println(employee4.compareTo(employee5));
		
		//+ve
		System.out.println(employee1.compareTo(employee));
		System.out.println(employee2.compareTo(employee1));
		System.out.println(employee3.compareTo(employee2));
		System.out.println(employee4.compareTo(employee3));
		System.out.println(employee5.compareTo(employee4));

	}

}
