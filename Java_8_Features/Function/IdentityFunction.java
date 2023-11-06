package Function;

import java.util.function.Function;

public class IdentityFunction {

	public static void main(String[] args) {
//		The speciality of this function is whatever input you are providing.
//		This function is always going to provide same as return type.
		Function<String,String> function3=Function.identity();
		System.out.println(function3.apply("Shankar"));//it will return Shankar
		

	}

}
