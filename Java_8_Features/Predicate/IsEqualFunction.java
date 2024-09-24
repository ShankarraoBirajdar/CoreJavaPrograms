package Predicate;

import java.util.function.Predicate;

public class IsEqualFunction {

	public static void main(String[] args) {
		
		Predicate<String> predicate = Predicate.isEqual("Shankar");
		Predicate<String> predicate1 = Predicate.not(predicate);
		
		System.out.println(predicate.test("Shankar"));//true
		System.out.println(predicate.test("Priyanka"));//false
		
		System.out.println(predicate1.test("Shankar"));//false
		System.out.println(predicate1.test("Priyanka"));//true

	}

}
