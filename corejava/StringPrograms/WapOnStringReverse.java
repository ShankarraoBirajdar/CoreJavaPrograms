package StringPrograms;

import java.io.*;
import java.io.InputStreamReader;
//WAP On I/P str1-->nitin and str2-->nitin reverse str2 and match str1 then string is equal
//this is same program applicable to palindrom
public class WapOnStringReverse 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The First String");
		String Str1=br.readLine();
		System.out.println("Enter The Second String");
		String Str2=br.readLine();
		int x=Str1.length();
		int y=Str2.length();
		String rev="";
		for(int i=x-1;i>=0;i--)
		{
			rev=rev+Str1.charAt(i);
			//System.out.print("\t"+rev);
			System.out.print("\t"+Str1.charAt(i));
		}
		
//		System.out.println("\n"+Str2);
		System.out.println(rev);
		String Str4=rev;
		System.out.println(Str4);
//		System.out.println(Str2==rev);
		if(Str4.equals(Str2))
		{
			System.out.println("\nString is Equal");
		}
		else
		{
			System.out.println("\nString is not Equal");
		}

	}

}
