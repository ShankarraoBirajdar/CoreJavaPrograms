package PrimitiveTypeFunctionalInterface;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PrimitiveTypePredicate {

	public static void main(String[] args) {

		int[] x = { 0, 5, 10, 15, 20, 25, 30 };

		// AutoBoxing is Required Here
		Predicate<Integer> predicate1 = I -> I % 2 == 0;

		for (int i : x) {
			if (predicate1.test(i)) {
				System.out.println(i);
			}
		}

		// AutoBoxing is Not Required Here
		IntPredicate predicate2 = I -> I % 2 == 0;
		for (int i : x) {
			if (predicate2.test(i)) {
				System.out.println(i);
			}
		}
		
		//Like IntPredicate we have PreDefined LongPredicate, DoublePredicate

	}

}
