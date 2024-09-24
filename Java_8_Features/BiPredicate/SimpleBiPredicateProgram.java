package BiPredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class SimpleBiPredicateProgram {

	public static void main(String[] args) {


		//SimplePredicateProgram
		Predicate<Integer> predicate= I->I%2==0;
		System.out.println(predicate.test(4));//true if Number is Even
		System.out.println(predicate.test(5));//false if Number is Odd
		
		//SimpleBiPredicateProgram
		BiPredicate<Integer,Integer> biPredicate= (a,b)->(a+b)%2==0;
		BiPredicate<Integer,Integer> biPredicate1= (a,b)->a>b;
		System.out.println(biPredicate.test(10,20));//true if Number is Even
		System.out.println(biPredicate.test(5,6));//false if Number is Odd
		
		System.out.println(biPredicate.negate().test(10, 20));
		System.out.println(biPredicate.or(biPredicate1).test(10, 20));
		System.out.println(biPredicate.and(biPredicate1).test(20, 10));

	}

}
