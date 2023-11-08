package SafeVarArgsAnnotationEnhancements;

import java.util.Arrays;
import java.util.List;

public class Example2 {
	//5 Memory in JVM
		//Heap Memory, stack Memory, Method Area, PC registers, Native method stacks
		//Heap Memory is very important because object is stored
		//Heap Pollution problem
		//One type of variable trying to pointing to another type object will get class cast exception at runtime
		// public int m1(){return 1;}
		//String str = (String) m1()   //<- Heap Pollution problem
		//Var arg Method with generic type may be chance of raising Heap Memory problem
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = Arrays.asList("A","B");
		List<String> list2 = Arrays.asList("C","D");
		m2(list1,list2);//warning - not required
		m3(list1,list2);//no warning
		m1(list1,list2);//warning  - required

	}
	//This Method will cause Heap Pollution problem because we are doing Assignments & Re-Assignments with another type
	public static void m1(List<String>... lists) {
		Object[]a = lists; //Assigning lists to Object
		a[0]=Arrays.asList(10,20); //Re Assigning oth index int values
		String name = lists[0].get(0);//CE: java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
		System.out.println(name);
	}
	
	//This Method will not cause Heap Pollution problem we are not doing Assignments & Re-Assignments with another type
	//but still complier getting warning that is : Type safety: A generic array of List<String> is created for a varargs parameter
	// using @SafeVarargs annotation we can convey to the complier there is no Assignments & Re-Assignments with another type
	//please do not generate warning
	public static void m2(List<String>... lists) {
		for (List<String> list : lists) {
			System.out.println(list);
		}
	}
	
	@SafeVarargs
	public static void m3(List<String>... lists) {
		for (List<String> list : lists) {
			System.out.println(list);
		}
	}
}
