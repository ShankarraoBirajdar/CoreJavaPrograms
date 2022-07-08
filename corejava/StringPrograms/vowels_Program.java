package StringPrograms;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class vowels_Program {

	public static void main(String[] args) throws Exception 
	{
		String s;int count=0,count2=0;
		
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter String");
		s=d.readLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'
					||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				count++;
			}
			else
			{
			count2++;	
			}
		}
		System.out.println("length of String="+s.length());
		System.out.println("vowels="+count);
		System.out.println("non vowels="+count2);
		

	}

}
