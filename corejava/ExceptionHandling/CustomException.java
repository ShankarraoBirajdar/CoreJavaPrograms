package ExceptionHandling;

import java.util.Scanner;

class NegativeNumberException extends Exception
{
	 NegativeNumberException(String s)
	 {
		super(s);
	}
}
class CheckException
{
	void check()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The No");
		int x=sc.nextInt();
		try
		{
			if(x<0)
			{
				throw new NegativeNumberException("Negative No Are Not Allowed");
			}
		}
		catch(NegativeNumberException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
public class CustomException {

	public static void main(String[] args)
	{
		CheckException c=new CheckException();
		c.check();

	}

}
