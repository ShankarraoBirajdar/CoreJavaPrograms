package StringPrograms;

import java.util.Scanner;
//WAP On i/p--> ShAnKaR o/p-->sHaNkAr
public class Assignment4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String a=sc.nextLine();
		for (int i = 0; i< a.length(); i++)
		{
		char ch = a.charAt(i);
		if(Character.isUpperCase(ch))
		{
	        if (65 <= ch && ch<=90)/*A...Z*/
	        {
	        ch = (char)( (ch +32) ); 
	        System.out.print(ch);
	        }
		}
		  
		else if(Character.isLowerCase(ch))
		{
	       if (ch>=97 && ch<=122)/*a....z*/
	       {
	        ch = (char)( (ch - 32) ); 
	        System.out.print(ch);
	        }
		}
		}

	}

}
