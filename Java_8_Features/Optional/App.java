package Optional;

import java.time.LocalDate;
import java.util.Optional;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {

		//Create Option object
		
		Optional<String> optionalStr1 = Optional.empty();
		System.out.println(optionalStr1);
		System.out.println(optionalStr1.isEmpty());
		System.out.println(optionalStr1.isPresent());
		if (optionalStr1.isPresent()) {
			System.out.println(optionalStr1.get());
		}
		optionalStr1.ifPresent(s->System.out.println(s.toUpperCase()));
		
		//Using Optional.of()
		Optional<String> optionalStr2 = Optional.of("String 2");
		System.out.println(optionalStr2);
		System.out.println(optionalStr2.isEmpty());
		System.out.println(optionalStr2.isPresent());
		if (optionalStr2.isPresent()) {
			System.out.println(optionalStr2.get());
		}
		optionalStr2.ifPresent(s->System.out.println(s.toUpperCase()));
		
		//Using Optional.ofNullable()
		Optional<String> optionalStr3 = Optional.ofNullable("String 3");
		System.out.println(optionalStr3);
		System.out.println(optionalStr3.isEmpty());
		System.out.println(optionalStr3.isPresent());
		if (optionalStr3.isPresent()) {
			System.out.println(optionalStr3.get());
		}
		optionalStr3.ifPresent(s->System.out.println(s.toUpperCase()));
		
		//orElse()
		String s1  = null;
		String out = Optional.ofNullable(s1).orElse("String is Null");
		System.out.println(out);
		
		//orElseGet(Supplier interface)
		Optional<LocalDate> od = Optional.empty();
		System.out.println(od.orElseGet(()->LocalDate.now()));
		
		//orElseThrow(Supplier interface)
//		Optional<Integer> item = Optional.empty();
		Optional<Integer> item = Optional.of(1);
		int x = item.orElseThrow(IllegalArgumentException::new);
		System.out.println(x);
		
		//filter(Predicate)
		Optional<Integer> age = Optional.of(20);
		int a = age.filter(n->n>18).get();
		System.out.println(a);
		
		//map(Function)
		Optional<Integer> price = Optional.of(20);
		System.out.println(price.map(n->n*n).get());
		
		//Example 1
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
		
		//Example 1
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
