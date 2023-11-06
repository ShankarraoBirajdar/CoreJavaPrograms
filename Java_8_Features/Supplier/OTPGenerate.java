package Supplier;

import java.util.function.Supplier;

public class OTPGenerate {

	public static void main(String[] args) {

		System.out.println("OTP is: "+generateOtp());
		
	}
	
	public static String generateOtp() {
		
		Supplier<Integer> supplier=()->{
			int randomNo=(int)(Math.random()*10);
			return randomNo;
			
		};
		
		
		String otp ="";
		for (int i = 0; i < 6; i++) {
			 otp = otp+supplier.get();
		}

		return otp;
	}

}
