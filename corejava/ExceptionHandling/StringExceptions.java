package ExceptionHandling;



public class StringExceptions {

	public static void main(String[] args)
	{
		try
		{
			String s="abc";
			char ch=s.charAt(10);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
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
