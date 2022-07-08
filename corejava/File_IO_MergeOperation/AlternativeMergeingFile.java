package File_IO_MergeOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class AlternativeMergeingFile
{

	public static void main(String[] args) 
	{
		try
		{
		PrintWriter pw=new PrintWriter("AlternativeMerge.txt");
		BufferedReader br1=new BufferedReader(new FileReader("File1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("File2.txt"));
		String line1=br1.readLine();
		String line2=br2.readLine();
		while(line1!=null||line2!=null)
		{
			if(line1!=null)
			{
				pw.println(line1);
				line1=br1.readLine();
			}
			if(line2!=null)
			{
				pw.println(line2);
				line2=br2.readLine();
			}
			
		}
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Operation is Successful");

	}

}
