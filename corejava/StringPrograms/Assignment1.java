package StringPrograms;
//WAP On if (1).profound+10=profound10 (2).10+10=100
import java.util.Scanner;

public class Assignment1
{
	public static void fun1(String s,int i)
	{
		int n=0,n1;
		
		try
		{
			n=Integer.parseInt(s);
			n1=n+i;
			System.out.println(n1);
		}
		catch(Exception e)
		{
			String s1=s + i;
	    System.out.println(s1);
	    }

	
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String x=sc.nextLine();
		System.out.println("Enter The Int Data");
		int y=sc.nextInt();
		fun1(x,y);
	}

}
