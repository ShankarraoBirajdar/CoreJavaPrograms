package Supplier;

import java.util.function.Supplier;

public class OTPGenerate {

	public static void main(String[] args) {

		System.out.println("OTP is: "+generateOtp());
		
	}
	
	public static String generateOtp() {
		
		Supplier<Integer> supplier=()->{
			double random = Math.random();
//			System.out.println(random);
			random = random *10 ;
//			System.out.println(random);
			int randomNo=(int)(random);
//			System.out.println(randomNo);
			return randomNo;
			
		};
		
		
		String otp ="";
		for (int i = 0; i < 6; i++) {
			 otp = otp+supplier.get();
		}
		otp = otp+supplier.get();

		return otp;
	}

}
