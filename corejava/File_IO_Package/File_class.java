package File_IO_Package;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class File_class {

	public static void main(String[] args) throws IOException 
	{
		System.out.println("File it is also use show directory");
		File f3=new File("shankar");
		System.out.println(f3.exists());
		f3.mkdir();//use to create new directory E:\Eclipse\Programs\CoreJava by default
		System.out.println(f3.exists());
		
		File f=new File("abc.txt");//check only file present or not
		System.out.println(f.exists());//first time show false and after show true
		f.createNewFile();//use to create new file
		System.out.println(f.exists());
		
		/*create directory named with c and in c create c.java file current working directory*/
		
		File a=new File("c");
		a.mkdir();
		System.out.println("direcory c is created-->"+a.exists());
		File a1=new File(a,"c.java");
		a1.createNewFile();
		System.out.println("c.java file is created-->"+a1.exists());
		
		/*create directory named with d and in d create c.java file using drive E:/ directory*/
		
		File b=new File("E:/d");
		b.mkdir();
		System.out.println("direcory d is created in E: drive-->"+b.exists());
		File b1=new File(b,"c.java");
		b1.createNewFile();
		System.out.println("c.java file is created-->"+b1.exists());
		
		
		

	}

}
