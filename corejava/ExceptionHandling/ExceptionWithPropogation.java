package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class one
{
	static void a() throws NumberFormatException, IOException
	{
	b();	
	}
	static void b() throws NumberFormatException, IOException
	{
		c();
	}
	static void c() throws NumberFormatException, IOException
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
	
}

public class ExceptionWithPropogation {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		try
		{
			one.a();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally proccess is Complete");
		}

	}

}
