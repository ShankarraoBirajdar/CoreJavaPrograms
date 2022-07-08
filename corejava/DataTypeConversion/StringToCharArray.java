package DataTypeConversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToCharArray {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the String");
		String s1=br.readLine();
		/*String Convert Character*/
		try
		{
			char[] c=s1.toCharArray();
			System.out.println(c);
		}catch(Exception e)
		{
			System.out.println("Out of Range-->MIN="+Character.MIN_VALUE+" MAX="+Character.MAX_VALUE+" SIZE="+Character.SIZE);
		}


	}

}
