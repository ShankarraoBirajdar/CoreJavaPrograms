package StringPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOperation {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The First String");
		String Str1=br.readLine();
		System.out.println("Enter The Second String");
    	String Str2=br.readLine();
		System.out.println("lengthOfString1 = "+Str1.length());
		System.out.println("lengthOfString2 = "+Str2.length());
		System.out.println("equals "+Str1.equals(Str2));
		System.out.println("equalsIgnoreCase "+Str1.equalsIgnoreCase(Str2));
		System.out.println("CharAt "+Str1.charAt(6));
		System.out.println("CompareTo "+Str1.compareTo(Str2));
		System.out.println("Trim "+Str1.trim());
		System.out.println("Concat "+Str1.concat(Str2));
		 System.out.println("subString "+Str1.substring(0,6));
		 System.out.println(Str1==Str2);
		 System.out.println("toUpperCase() "+Str1.toUpperCase()); 
		   System.out.println("toLowerCase() "+Str2.toLowerCase()); 
		   System.out.println("StartsWith "+Str1.startsWith("Sa"));
		   
		   String s=new String("Sachin");  
		   String s2=s.intern();  
		   System.out.println(s2);//Sachin  

	}

}
