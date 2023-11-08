package SafeVarArgsAnnotationEnhancements;

import java.util.Arrays;
import java.util.List;

public class Example3 {

	//@SafeVarargs introduced in 1.7 v but only for Constructor, Static method, Final Method
	//From 1.9v onwards it is applicable private method s also
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A","B");
		List<String> list2 = Arrays.asList("C","D");
		Example3 example3 = new Example3(list1,list2);
		Example3.m1(list1,list2);
		example3.m2(list1,list2);
		example3.m3(list1,list2);

	}
	
	@SafeVarargs
	public Example3(List<String>... lists) {
		System.out.println("@SafeVarargs annotation is allowed in Constructor from 1.7v");
	}
	
	@SafeVarargs
	public static void m1(List<String>... lists) {
		System.out.println("@SafeVarargs annotation is allowed in Static method from 1.7v");
	}
	
	@SafeVarargs
	public final void m2(List<String>... lists) {
		System.out.println("@SafeVarargs annotation is allowed in Final method from 1.7v");
	}
	
	@SafeVarargs
	private void m3(List<String>... lists) {
		System.out.println("@SafeVarargs annotation is allowed in private method from 1.9v but not in 1.8v");
	}

	//CE: @SafeVarargs annotation cannot be applied to non-final instance method m4
//	@SafeVarargs
//	public void m4(List<String>... lists) {
//		System.out.println("@SafeVarargs annotation is allowed in Final method from 1.7v");
//	}
}
