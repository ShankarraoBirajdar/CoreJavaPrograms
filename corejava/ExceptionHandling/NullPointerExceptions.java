package ExceptionHandling;

public class NullPointerExceptions {

	public static void main(String[] args)
	{
		String s=null;
		try
		{
		System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("proccess is Complete");
		}

	}

}
