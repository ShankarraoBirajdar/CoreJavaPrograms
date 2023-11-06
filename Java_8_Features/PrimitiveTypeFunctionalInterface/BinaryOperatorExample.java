package PrimitiveTypeFunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<String, String, String> biFunction = (str1,str2)->str1+str2;
		System.out.println(biFunction.apply("Shankar", "rao"));
		
//		If all input and return type is the same. or All the three type parameters are same time.
//		To handle such type of requirement, we should go for binary operator 
		
		BinaryOperator<String> binaryOperator = (str1,str2)->str1+str2;
		System.out.println(binaryOperator.apply("Shankar", "rao"));
	}

}
