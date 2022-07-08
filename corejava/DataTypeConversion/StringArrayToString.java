package DataTypeConversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringArrayToString {

	public static void main(String[] args) throws IOException
	{
		
		String s[]={"A","B","C","D","E"};
		for(String s1:s)
		{
			System.out.print("\t"+s1);
		}
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the 5 String");
		String s2[]=new String[5];
		for(int j=0;j<s2.length;j++)
	    s2[j]= br.readLine();
		
//		for(int j=0;j<s2.length;j++)
//		System.out.println(s2[j]);
		
		for(String s3:s2)
		{
			System.out.print(s3);
		}
	

	}

}
