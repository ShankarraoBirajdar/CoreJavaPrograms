package Optional;

import java.util.Optional;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {

		String str= null;
		//To handle NullPointerException before 1.8v we are using try catch block
		try {
			System.out.println(str.toUpperCase());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		//NO need to use try catch block to handle NullPointerException, go with Optional class
		
		
		Optional<String> optional =Optional.ofNullable(str);
		
		System.out.println(optional.isPresent());
		if (optional.isPresent()) {
			System.out.println(optional.get());//get the value
		}
		System.out.println(optional.orElse("Null value is assigned"));
		
		String str1="Shankar";
		
		Optional<String> optional2 =Optional.ofNullable(str1);
		System.out.println(optional2.isPresent());
		if (optional2.isPresent()) {
			System.out.println(optional2.get());//get the value
		}
		
		optional2.ifPresent(s->{
			char[] chars = s.toCharArray();
			for (char ch : chars) {
				System.out.print(ch+" ");
			}
			
			System.out.println("\n"+optional2.get().toUpperCase());
		});

	}

}
