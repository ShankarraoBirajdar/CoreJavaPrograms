package TryCatchBlock;

import java.io.IOException;

public class TryCatchExample1 {

	public static void main(String[] args) {

		//Partially Checked Exception
		try {
			System.out.println("Hello");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Unchecked Exception
		try {
			System.out.println("Hello");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		

		//Fully Checked Exception
//		try {
//			System.out.println("Hello");
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
		
		// This exception is never thrown from the try statement body

	}

}
