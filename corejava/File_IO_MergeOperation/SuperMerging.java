package File_IO_MergeOperation;
//WAP to Merge All Data From One Location to in One Format(txt) File
import java.io.*;

public class SuperMerging {

	public static void main(String[] args)
	{
		try {
			BufferedReader br=null;
			PrintWriter pw=new PrintWriter("AllInOne.txt");
			File f=new File("E:\\Eclipse\\Programs\\CoreJava\\c");
			String s[]=f.list();
			for(String s1:s)
			{
				br=new BufferedReader(new FileReader(new File(f,s1)));
				String line=br.readLine();
				while(line!=null)
				{
					pw.println(line);
					line=br.readLine();
				}
				
			}
			pw.flush();
			br.close();
			pw.close();
		} catch (Exception e)
		{
			
			System.out.println(e);
		}
		System.out.println("Operation is Successful");

	}

}
