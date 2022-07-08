package ExceptionHandling;

public class TechGigHCL {

	public static void main(String[] args) 
	{
		try
		{
			
			System.out.println("hello" +" "+1/0);
		}catch(Exception e)
		{
			System.out.println("world");
		}

	}

}
