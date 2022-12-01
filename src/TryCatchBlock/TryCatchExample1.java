package TryCatchBlock;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.FileHandler;

public class TryCatchExample1 {

	public static void main(String[] args) {
		
		
//		Fully Checked Exception
//		try {
//			File f=new File("abc.txt");
//			FileInputStream fileInputStream =new FileInputStream(f);
			System.out.println("Hello");
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
		
//		 This exception is never thrown from the try statement body

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
		



	}

}
