package Function;

import java.util.function.Function;

public class FunctionChainExample {

	public static void main(String[] args) {


		//Upper Case Code
		Function<String,String> function1=s->s.toUpperCase();
		
		//Name Substring Code
		Function<String,String> function2=s->s.substring(0, 10);//0 to 8
		
		String name="ShankarraoBirajdar";
		
		System.out.println("function1.apply: "+function1.apply(name));
		System.out.println("function2.apply: "+function2.apply(name));
		System.out.println("function1.andThen(function2).apply: "+function1.andThen(function2).apply(name));
		System.out.println("function1.compose(function2).apply: "+function1.compose(function2).apply(name));
			

	}

}
