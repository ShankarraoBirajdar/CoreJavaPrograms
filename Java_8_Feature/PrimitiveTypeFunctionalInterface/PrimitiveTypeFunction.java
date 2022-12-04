package PrimitiveTypeFunctionalInterface;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToLongFunction;
import java.util.function.ToIntFunction;

public class PrimitiveTypeFunction {

	public static void main(String[] args) {

		// AutoBoxing And AutoUnboxing is Required Here
        Function<Integer, Integer> function1=I->I*I;
        System.out.println("And is: "+function1.apply(10));
        
    	// AutoBoxing is Not Required Here But AutoUnboxing is Required Here
        IntFunction<Integer> function2=I->I*I;
        System.out.println("And is: "+function2.apply(20));
        
         // AutoBoxing is Required Here but AutoUnboxing is Not Required Here 
        ToIntFunction<Integer> function3=I->I*I;
        System.out.println("And is: "+function2.apply(30));
        
        // AutoBoxing And AutoUnboxing is Not Required Here
        IntToLongFunction function4=I->I*I;
        System.out.println("And is: "+function2.apply(40));
        
        //15  Primitive Type Functional Interface
        //Due to this internal AutoBoxing and AutoUnboxing is not Required 
        // AutoBoxing
        
        //IntFunction<Integer>
        //LongFunction<Long>
        //DoubleFunction<Double>
        
        //AutoUnboxing
        
        //ToIntFunction<Integer>
        //ToLongFunction<Long>
        //ToDoubleFunction<Double>
        
        //Both AutoBoxing & AutoUnboxing
        
        //IntToLongFunction
        //IntToDoubleFunction
        
        //LongToIntFunction
        //LongToFunction
        
        //DoubleToIntFunction
        //DoubleToLongFunction
        
        //ToIntBiFunction
        //ToLongBiFunction
        //ToDoubleBiFunction
	}

}
