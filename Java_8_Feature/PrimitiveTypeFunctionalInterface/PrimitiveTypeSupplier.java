package PrimitiveTypeFunctionalInterface;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class PrimitiveTypeSupplier {

	public static void main(String[] args) {

		//AutoUnboxing is Required Here
		Supplier<Integer> supplier1=()->{
			int randomNo=(int)(Math.random()*10);
			return randomNo;
			
		};
		String otp ="";
		for (int i = 0; i < 6; i++) {
			 otp = otp+supplier1.get();
		}
		System.out.println(otp);
		
		
		//AutoUnboxing is Not Required Here
		IntSupplier supplier2=()->{
			int randomNo=(int)(Math.random()*10);
			return randomNo;
			
		};
		String otp1 ="";
		for (int i = 0; i < 6; i++) {
			 otp1 = otp1+supplier2.getAsInt();
		}
		System.out.println(otp1);
		
		//IntSupplier   int getAsInt();
		//LongSupplier
		//DoubleSupplier
		//BooleantSupplier

	}

}
