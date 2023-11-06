package Predicate;

import java.util.function.Predicate;

public class SimplePredicateProgram {

	public static void main(String[] args) {
	
		Predicate<Integer> predicate= I->I>5;
		System.out.println(predicate.test(100));//true if No is Greater Than 5
		System.out.println(predicate.test(4));//false if No is less Than 5
		
		Predicate<String> predicate2= str->str.length()>5;
		System.out.println(predicate2.test("Shankar"));//true if String length is Greater Than 5
		System.out.println(predicate2.test("ABC"));//false if String length is less Than 5
		
		Predicate<Integer> predicate3= I->I%2==0;
		System.out.println(predicate3.test(4));//true if Number is Even
		System.out.println(predicate3.test(5));//false if Number is Odd
	}

}
