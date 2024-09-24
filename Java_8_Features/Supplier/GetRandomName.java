package Supplier;

import java.util.function.Supplier;

public class GetRandomName {

	public static void main(String[] args) {
		
		
		
		Supplier<String> supplier=()->{
			String[] name= {"Kailas", "Shankar","Priyanka","Aadi","Prajakta","Pooja","Pranita"};
			double random = Math.random();
//			System.out.println(random);
			random = random *7 ;
//			System.out.println(random);
			int randomNo=(int)(random);
//			System.out.println(randomNo);
			return name[randomNo];
			
		};
		
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());

	}

}
