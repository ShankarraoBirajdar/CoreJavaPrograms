package Function;

import java.util.function.Function;

public class IdentityFunction {

	public static void main(String[] args) {
		Function<String,String> function3=Function.identity();
		System.out.println(function3.apply("Shankar"));//it will return Shankar

	}

}
