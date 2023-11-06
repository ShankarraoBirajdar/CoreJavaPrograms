package Function;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;


public class AuthenticationByUsingFunction {

	public static void main(String[] args) {

		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Username");
		String  username=scanner.next();
		System.out.println("Enter Password");
		String  password=scanner.next();
		
		
		Function<String, String> function1=s->s.substring(0,5);
		Function<String, String> function2=s->s.toLowerCase();
		
		if(function1.andThen(function2).apply(username).equals("shank") && password.equals("java")) {
			System.out.println("Valid Employee");
		}else {
			System.out.println("Invalid Employee");
		}
	}

}
