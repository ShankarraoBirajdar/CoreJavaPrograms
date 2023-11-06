package Predicate;

import java.util.function.Predicate;

public class PredicateWithNegateAndOr {

	public static void main(String[] args) {
		int x[]= {0,5,10,15,20,25,30};
		
		Predicate<Integer> predicate1= I->I>10;
		Predicate<Integer> predicate2= I->I%2==0;
		
		System.out.println("The Number is Greater Than 10 are:");
		m1(predicate1,x);
		System.out.println("The Number Not Greater Than 10 are:");
		m1(predicate1.negate(),x);
		
		System.out.println("The Even Numbers are:");
		m1(predicate2,x);
		System.out.println("The Odd Numbers are:");
		m1(predicate2.negate(),x);

		System.out.println("The Number is Greater Than 10 And Even Numbers are:");
		m1(predicate1.and(predicate2),x);
		System.out.println("The Number is Greater Than 10 And Odd Numbers are:");
		m1(predicate1.and(predicate2.negate()),x);
		
		System.out.println("The Number is Less Than 10 And Even Numbers are:");
		m1(predicate2.and(predicate1.negate()),x);
		System.out.println("The Number is Less Than 10 And Odd Numbers are:");
		m1(predicate1.negate().and(predicate2.negate()),x);
		
		System.out.println("The Number is Greater Than 10 or Even Numbers are:");
		m1(predicate1.or(predicate2),x);
	}
	
	public static void m1(Predicate<Integer> predicate, int []x) {
		
		for (int x1:x) {
			if(predicate.test(x1)) {
				System.out.println(x1);
			}
		}
	}

}
