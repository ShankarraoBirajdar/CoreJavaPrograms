package File_IO_Package;

import java.io.File;

public class ListOfFiles {

	public static void main(String[] args) throws Throwable
	{
		/*using File listFiles()*/
		int count=0;
		File f=new File("c:");
		File[] f1=f.listFiles();
		for(File f2:f1)
		{
			count++;
			System.out.println(f2);
		}
		System.out.println("totle no of"+count);
		
	/*using String list()*/
		int count2=0;
		File ff=new File("c:\\java\\jdk\\bin");
		 
		String[] s=ff.list();
		for(String s1:s)
		{
			count2++;
			System.out.println(s1);
				
		}
		System.out.println("totle no of files "+count2);
		

		
		

	}

}
