package ComparatorExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator_Employee {

	public static void main(String[] args) {

//		Employee employee=new Employee(101,"Shankar");
//		Employee employee1=new Employee(102,"Priyanka");
//		Employee employee2=new Employee(103,"Onkar");
//		Employee employee3=new Employee(104,"Pooja");

		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(new Employee(104, "Pooja"));
		list.add(new Employee(101, "Shankar"));
		list.add(new Employee(103, "Onkar"));
		list.add(new Employee(102, "Priyanka"));
		
		

//		Collections.sort(list,
//				(e1, e2) -> (e1.getEmpId() > e2.getEmpId()) ? -1 : (e1.getEmpId() < e2.getEmpId()) ? 1 : 0);
//		Collections.sort(list,
//				(e1, e2) -> (e1.getEmpId() < e2.getEmpId()) ? -1 : (e1.getEmpId() > e2.getEmpId()) ? 1 : 0);

		Collections.sort(list, new MyComparator());
		System.out.println(list);
	}

}

class MyComparator implements Comparator<Employee> {
	
//	@Override
//	public int compare(Employee e1, Employee e2) {
//		//Ascending Order Logic Using Ternary Operator
//		return  (e1.getEmpId() < e2.getEmpId()) ? -1 : (e1.getEmpId() > e2.getEmpId()) ? 1 : 0;
//	}
	
	@Override
	public int compare(Employee e1, Employee e2) {
		//Descending Order Logic Using Ternary Operator
		return  (e1.getEmpId() > e2.getEmpId()) ? -1 : (e1.getEmpId() < e2.getEmpId()) ? 1 : 0;
	}

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		//Descending Order Logic
//		if (o1.getEmpId() > o2.getEmpId()) {
//			return -1;
//		} else if (o1.getEmpId() < o2.getEmpId()) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}
	
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		//Ascending Order Logic
//		if (o1.getEmpId() < o2.getEmpId()) {
//			return -1;
//		} else if (o1.getEmpId() > o2.getEmpId()) {
//			return 1;
//		} else {
//			return 0;
//		}
//	}


}
