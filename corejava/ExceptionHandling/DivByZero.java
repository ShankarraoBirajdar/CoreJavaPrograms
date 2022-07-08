package ExceptionHandling;

import java.io.*;
import java.io.InputStreamReader;

public class DivByZero 
{
	public static void main(String[] args)throws IOException
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter The First num");
		    int a =Integer.parseInt(br.readLine());
			System.out.println("Enter The Second num");
			int b=Integer.parseInt(br.readLine());
			if(b==0)
			{
				throw new ArithmeticException("Divide By Zero is not possible");
			}
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			//System.out.println(e);
			System.out.println(e.getMessage());

		}
		finally
		{
			System.out.println("proccess is Complete");
		}
		
	}

}
