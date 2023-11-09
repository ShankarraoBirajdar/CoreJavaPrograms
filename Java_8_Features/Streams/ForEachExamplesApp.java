package Streams;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ForEachExamplesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("A");
		names.add("BB");
		names.add("CCC");
		
		names.stream().forEach(str->System.out.println(str));

		//replace with method reference
		names.stream().forEach(System.out::println);
		
		int numbers[] = {1,2,3,4,5,6,7,8,9};
		
		Arrays.stream(numbers).forEach(n->{
			if (n%2==0) {
				System.out.print(" Even: "+n+" ");
			}
			else {
				System.out.print("Odd: "+n);
			}
		});


	}

}
