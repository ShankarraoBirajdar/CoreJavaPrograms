package Supplier;

import java.util.function.Supplier;

public class GetRandomName {

	public static void main(String[] args) {
		
		
		
		Supplier<String> supplier=()->{
			String[] name= {"Kailas", "Shankar","Priyanka","Aadi","Prajakta","Pooja","Pranita"};
			int randomNo=(int)(Math.random()*7);
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
