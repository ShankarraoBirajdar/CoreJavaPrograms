package PrimitiveTypeFunctionalInterface;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorPrimitiveExample {

	public static void main(String[] args) {
		// AutoBoxing And AutoUnboxing is Required Here
		UnaryOperator<Integer> unaryOperator=I->I*I;
		System.out.println(unaryOperator.apply(10));
		
		// AutoBoxing is Not Required Here But AutoUnboxing is Required Here
		IntUnaryOperator intUnaryOperator=I->I*I;
		System.out.println(intUnaryOperator.applyAsInt(10));
	}

}
//PreDefined primitive version of UnaryOperator
//IntUnaryOperator
//DoubleUnaryOperator
//LongUnaryOperator