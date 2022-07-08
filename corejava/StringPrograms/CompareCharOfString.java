package StringPrograms;
import java.io.*;
public class CompareCharOfString {
	 
	public static void main(String[] args) throws IOException
	{
		 
		int count=0,j=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter The First String");
		String a=br.readLine();
		System.out.println("Enter The Second String");
		String b=br.readLine();
		int x=a.length();
		int y=b.length();
		System.out.print("Matched Charactters are:");
		for(int i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				if(a.charAt(i)==b.charAt(j))
				{
					System.out.print("\t"+b.charAt(j));
				    count++;
					continue;
				}
			}
			
		}
		System.out.println("\n"+count+" Character Are Matched");
//		if(count==y||count==x)
//		{
//			System.out.println("String is Equal");
//		}
		if(a.equalsIgnoreCase(b))
		System.out.println("String is Equal");
		else
			System.out.println("String is Not Equal");
	}

}
