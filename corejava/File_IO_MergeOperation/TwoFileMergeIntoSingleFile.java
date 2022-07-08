package File_IO_MergeOperation;
import java.io.*;
public class TwoFileMergeIntoSingleFile 
{

	public static void main(String[] args) 
	{
		try
		{
		PrintWriter pw=new PrintWriter("File3.txt");
		BufferedReader br=new BufferedReader(new FileReader("File1.txt"));
		String line=br.readLine();
		while(line!=null)
		{
			pw.println(line);
			line=br.readLine();
		}
		br=new BufferedReader(new FileReader("File2.txt"));
		 line=br.readLine();
		while(line!=null)
		{
			pw.println(line);
			line=br.readLine();
		}
		pw.flush();
		br.close();
		pw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Operation is Successful");

	}
		

}
