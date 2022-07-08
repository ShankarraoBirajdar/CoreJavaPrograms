package File_IO_Package;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FIleReader_Operation {

	public static void main(String[] args) throws IOException
	{
		FileReader fr=new FileReader("s.txt");
		int i=0,n=fr.read();//here read() return unicode value of character
		       while(n!=-1)
				{
			System.out.print((char)n);
			n=fr.read();
				}
		       
		       System.out.print("\n using int read(char[] ch)\n");
		       
		       /*using int read(char[] ch)*/
		       File f=new File("abc.txt");
		       int a=(int) f.length();
		    
		       char[] ch=new char[(int) f.length()];
		       FileReader fr2=new FileReader(f);
		       fr2.read(ch);//here read() return no character present in file
		       for(char c:ch)
		       {
		    	   System.out.print(c);
		       }
		       

	}

}
