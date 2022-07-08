package StringPrograms;

import java.io.*;
import java.util.Scanner;

public class ConvertIntToString
{

	public static void main(String[] args) throws IOException
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Integer No");
//		int n=sc.nextInt();
//		String s=Integer.toString(n);
//		System.out.println("you are enter-->"+s);
		
//		System.out.println("Enter the Character ");
//		char c[]=sc.nextLine();
//		String s1=Character.toString(c);
		
		
	
		/* Convert Array to primitive DataType Use For Loop*/
		int[] numbers ={10,20,30,40,50};
		for(int x : numbers ){
		System.out.print(x);
		System.out.print(",");
		}
		System.out.print("\n");
		String[] names ={"James","Larry","Tom","Lacy"};
		for(String name : names ){
		System.out.print( name );
		System.out.print(",");
		}
		/*The method converts the value of the Number Object that invokes the method to
		   the primitive data type that is
           returned from the method.*/
		Integer x =5;
		// Returns byte primitive data type
		System.out.println( x.byteValue());
		// Returns double primitive data type
		System.out.println(x.doubleValue());
		// Returns long primitive data type
		System.out.println( x.longValue());
		
		Byte ab=100;Character ch='h';Double db=99.00; Short dh=9; Integer hh=77; Float ff=55f;
		Boolean t=true;String ss="s"; Long h=Long.valueOf(ch);
		Integer b =Integer.valueOf("444",16);
		System.out.println(b);
		
		
	}

}
