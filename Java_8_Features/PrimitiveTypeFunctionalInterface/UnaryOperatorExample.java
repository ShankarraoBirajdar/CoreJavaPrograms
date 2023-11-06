package PrimitiveTypeFunctionalInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		
		Function<Integer, Integer> function=I->I*I;
		System.out.println(function.apply(10));
//		If input and the return type both are same type, don't go for function directly,
//		you can go for unary operator.
		UnaryOperator<Integer> unaryOperator=I->I*I;
		System.out.println(unaryOperator.apply(10));
	}

}
