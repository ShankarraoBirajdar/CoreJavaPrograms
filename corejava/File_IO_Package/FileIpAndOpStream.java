package File_IO_Package;

import java.io.*;
import java.util.Scanner;

public class FileIpAndOpStream 
{static int count;

	public static void main(String[] args) throws IOException 
	{
		int i=0;
		try {

			FileOutputStream fout=new FileOutputStream("a.txt");
			
			FileInputStream fin=new FileInputStream("a.txt");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter String");//ABC
			
			String s=sc.nextLine();
			
			byte[] b=s.getBytes();
			
			int x=b.length;
			i=fin.read();
			
//			System.out.println(i+"\n");
			
			while((i=fin.read())!=-1)
			{
				System.out.println(i+"\n");
				count++;
			}
			if((i=fin.read())==-1)
			{
				for(int j=0;j<x;j++)
				{
					fout.write(b[j]);
				}
			}else
			{
				for(int j=count;j<x;j++)
				{
					fout.write(b[j]);
				}
			}
			
			
			
			
//			
//			System.out.println("Enter String");
//			String s1=sc.nextLine();
//			byte[] b1=s1.getBytes();
//			System.out.println("Enter String");
//			fout.write(b1);
//			String s2=sc.nextLine();
//			byte[] b2=s2.getBytes();
//			fout.write(b2);
			while((i=fin.read())!=-1)
			{
			System.out.print(i);System.out.print((char)i);count++;}
			fout.flush();
			fout.close();
			

		} catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
