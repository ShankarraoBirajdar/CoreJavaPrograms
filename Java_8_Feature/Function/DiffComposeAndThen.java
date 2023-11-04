package Function;

import java.util.function.Function;

public class DiffComposeAndThen {

	public static void main(String[] args) {
		//Addition Code
		Function<Integer,Integer> function1=I->I+I;
		
		//Cude Code
		Function<Integer,Integer> function2=I->I*I*I;

		System.out.println(function1.apply(2));
		System.out.println(function2.apply(2));
		//andThen -> First it will execute function1 and then function 2 
		System.out.println(function1.andThen(function2).apply(2));
		//compose -> First it will execute function2 and then function 1
		System.out.println(function1.compose(function2).apply(2));
	}

}
