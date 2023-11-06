package PrimitiveTypeFunctionalInterface;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveTypeFunction {

	public static void main(String[] args) {

		// AutoBoxing And AutoUnboxing is Required Here
		Function<Integer, Integer> function1 = I -> I * I;
		System.out.println("And is: " + function1.apply(10));

		// AutoBoxing is Not Required Here But AutoUnboxing is Required Here
		IntFunction<Integer> function2 = I -> I * I;
		System.out.println("And is: " + function2.apply(20));

		// AutoBoxing And AutoUnboxing is Required Here
		Function<Integer, Double> function5 = I -> Math.sqrt(I);
		System.out.println("And is: " + function5.apply(10));

		// AutoBoxing is Required Here but AutoUnboxing is Not Required Here
		ToDoubleFunction<Integer> function3 = I -> Math.sqrt(I);
		System.out.println("And is: " + function3.applyAsDouble(30));

		// AutoBoxing And AutoUnboxing is Required Here
//		Function<Integer, Long> function6 = I -> Math.absExact(I);
//		System.out.println("And is: " + function6.apply(400000));

		// AutoBoxing And AutoUnboxing is Not Required Here
		IntToLongFunction function4 = I -> Math.absExact(I);
		System.out.println("And is: " + function4.applyAsLong(400000000));

		// 15 Primitive Type Functional Interface
		// Due to this internal AutoBoxing and AutoUnboxing is not Required
		// AutoBoxing

		// IntFunction<Integer>
		// LongFunction<Long>
		// DoubleFunction<Double>

		// AutoUnboxing

		// ToIntFunction<Integer>
		// ToLongFunction<Long>
		// ToDoubleFunction<Double>

		// Both AutoBoxing & AutoUnboxing

		// IntToLongFunction
		// IntToDoubleFunction

		// LongToIntFunction
		// LongToFunction

		// DoubleToIntFunction
		// DoubleToLongFunction

		// ToIntBiFunction
		// ToLongBiFunction
		// ToDoubleBiFunction
	}

}
