package TryWithResourcesEnhancements;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException {

		preJDK7();
		JDK7();
		JDK9();

	}

	public static void preJDK7() throws IOException {
		// 1.6v
		BufferedReader bufferedReader = null;
		try {
			// TODO: riskey code
			bufferedReader = new BufferedReader(new FileReader("abc.txt"));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// cleanup code
			if (bufferedReader!=null) {
				bufferedReader.close();
				System.out.println("resource closed");
			}
		}
	}

	public static void JDK7() {
		// 1.7v

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader("abc.txt"))) {
			// TODO: riskey code
//			bufferedReader = new BufferedReader(new FileReader("abc.txt"));//CE: The resource bufferedReader of a try-with-resources statement cannot be assigned
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void JDK9() throws IOException  {
		// 1.8v
		BufferedReader br1 = new BufferedReader(new FileReader("abc.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("abc.txt"));
		BufferedReader br3 = new BufferedReader(new FileReader("abc.txt"));
		BufferedReader br4 = new BufferedReader(new FileReader("abc.txt"));
		try (br1;br2;br3;br4) {
			// TODO: riskey code
//			bufferedReader = new BufferedReader(new FileReader("abc.txt"));//CE: The resource bufferedReader of a try-with-resources statement cannot be assigned
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
