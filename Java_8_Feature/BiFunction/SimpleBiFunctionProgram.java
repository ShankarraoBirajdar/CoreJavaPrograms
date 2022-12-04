package BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class SimpleBiFunctionProgram {

	public static void main(String[] args) {

		
		 //Function
        Function<Integer, Integer> function=I->I*I;
        System.out.println("Multiplication is : "+function.apply(10));
        
         //BiFunction
        BiFunction<Integer, Integer, Integer> biFunction=(a,b)->a*b;
        System.out.println("Multiplication is : "+biFunction.apply(10,20));

	}

}
