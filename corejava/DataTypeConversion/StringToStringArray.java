package DataTypeConversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringToStringArray 
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the String");
		String s1=br.readLine();
		/*String Convert String[]*/
		String []s2=new String[s1.length()];
		for(int i=0;i<s1.length();i++)
		{
			s2[i]=String.valueOf(s1.charAt(i));
			System.out.println("\tStart Index ["+i+"] =  "+s2[i]+"    End Index ["+ (i+1) +"]");
		}

	}

}
