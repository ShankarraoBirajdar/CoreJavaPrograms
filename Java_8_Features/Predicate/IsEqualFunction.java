package Predicate;

import java.util.function.Predicate;

public class IsEqualFunction {

	public static void main(String[] args) {
		
		Predicate<String> predicate = Predicate.isEqual("Shankar");
		
		System.out.println(predicate.test("Shankar"));//true
		System.out.println(predicate.test("Priyanka"));//false

	}

}
