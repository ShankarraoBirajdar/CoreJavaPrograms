package Collection_Program.List;
import java.util.*;
public class ArrayList_2 {

	public static void main(String[] args) {
		int array[] = new int [5];
		
		 for (int i = 5; i > 0; i--)
		 System.out.println( array[5-i] = i);
		 
		 for (int i = 0; i < 5 ; i++)
			 System.out.print(array[i]);
		 
		 Arrays.fill(array, 0, 4, 8);
		 System.out.println("\n");
		for (int i = 0; i < 5 ; i++)
		 System.out.print(array[i]);

		
		
		

	}

}

