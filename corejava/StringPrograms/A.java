package StringPrograms;

import java.util.Scanner;

public class A
{

	public static void main(String[] args) 
	{
		String str1="Shankar Birajdar";//literal Way

		char ch1[]=str1.toCharArray();
		System.out.println(ch1);
		System.out.println("ch1="+ch1);
		System.out.println(str1.toCharArray());
		System.out.print("Using For Loop-->");
		for(int i=0;i<ch1.length;i++)
		{
			System.out.print(""+ch1[i]);
		}
		String str2=new String("Shankar birajdar");//Using new Keyword

		char ch2[]=str2.toCharArray();
		System.out.println("\nch1="+ch2);
		System.out.println(str2.toCharArray());

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		String str3=sc.nextLine();             //Data Add At Run Time
		char[] words = str3.toCharArray();
		System.out.println(words);

//		StringBuffer br[]= new StringBuffer[6];
//		StringBuffer br2=new StringBuffer("abcdefg");
//		StringBuilder sb[]=new StringBuilder[6];
//		StringBuilder sb2=new StringBuilder("abcdefg");
/*Error occurred during initialization of VM
		Could not reserve enough space for object heap*/

	}

}
