package StringPrograms;
//WAP On i/p-->shankar kedarnath birajdar o/p-->Shankar.K.B
import java.util.Scanner;

public class Assignment3 
{


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Full Name \n [ name and mid name ,mid name and sir name Space is Complusary]");
		String s1=sc.nextLine();
		char[] words = s1.toCharArray();
		int g=0,l=0;
		System.out.print(s1.substring(0,1).toUpperCase());
		for(int i=1;i<words.length;i++)
		{
			try
		     {
				if(words[i]==32)//32 means space ' ' ASCII Value
			    {
				g=i;
				break;
			   }
			   System.out.print(s1.charAt(i));
		     }catch(Exception e){}	
		}
		try{if(g!=0)
			System.out.print("."+s1.substring(g+1,g+2).toUpperCase());}catch(Exception e){}
		
		for(int j=g+1;j<words.length;j++)
		{
			try
			{
			if(words[j]==32)
					{
				    l=j;
				    System.out.print("."+s1.substring(l+1,l+2).toUpperCase());
					continue;	
					}
			}catch(Exception e){}
		}

	}

}
