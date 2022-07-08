package StringPrograms;

public class toLowerAndUpper 
{

	public static void main(String[] args)
	{

		toLowerCase("ShAnKar");
		toUpperCase("shan");
		}

		public static void toLowerCase(String a)
		{

		for (int i = 0; i< a.length(); i++)
		{

		    char ch = a.charAt(i);
		    if (65 <= ch && ch<=90)
		    {
		    ch = (char)( (ch + 32) ); 
		    }

		    System.out.print(ch);
		 }
		}
		public static void toUpperCase(String a)
		{
        System.out.println();
		for (int i = 0; i< a.length(); i++)
		{

		    char ch = a.charAt(i);
		    if (ch>=97 && ch<=122)
		    {
		    ch = (char)( (ch - 32) ); 
		    }

		    System.out.print(ch);
		 }
		}

}
