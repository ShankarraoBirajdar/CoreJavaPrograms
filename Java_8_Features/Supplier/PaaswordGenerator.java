package Supplier;

import java.util.function.Supplier;

public class PaaswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Generated Password is: "+generatePassword());
		System.out.println("Generated Password is: "+generatePassword());
		System.out.println("Generated Password is: "+generatePassword());
		System.out.println("Generated Password is: "+generatePassword());
		System.out.println("Generated Password is: "+generatePassword());
		System.out.println("Generated Password is: "+generatePassword());
	}
	
public static String generatePassword() {
		

		
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$";
		Supplier<Character> supplier1=()->{
			int randomNo=(int)(Math.random()*55);
			return str.charAt(randomNo);
			
		};
		
		Supplier<Integer> supplier2=()->{
			int randomNo=(int)(Math.random()*10);
			return randomNo;
			
		};
		
		
		String password ="";
		for (int i = 0; i < 8; i++) {
			if (i%2==0) {
				password = password+supplier2.get();
			}
			password = password+supplier1.get();
		}

		return password;
	}

}
