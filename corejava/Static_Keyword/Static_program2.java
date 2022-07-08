package Static_Keyword;

public class Static_program2 
{
	
	 Static_program2()
	 {
		 System.out.println("hello Constructor");
	 }
	 
	 static int a=m1();
	 static int m1()
	{
		 System.out.println("hello static method");
		 //System.exit(0);
		return 10;
		
	}
	public static void main(String[] args)
	{
		
		Static_program2 s=new Static_program2();
	}

}
