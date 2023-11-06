package PrimitiveTypeFunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinaryOperatorPrimitiveExample {

	public static void main(String[] args) {
		
		// AutoBoxing And AutoUnboxing is Required Here
		BinaryOperator<Integer> binaryOperator = (I1,I2)->I1+I2;
		System.out.println(binaryOperator.apply(10, 20));
		
		// AutoBoxing is Not Required Here But AutoUnboxing is Required Here
		IntBinaryOperator intBinaryOperator = (I1,I2)->I1+I2;
		System.out.println(intBinaryOperator.applyAsInt(10, 20));

	}

}
//PreDefined primitive version of BinaryOperator
//IntBinaryOperator
//DoubleBinaryOperator
//LongBinaryOperator