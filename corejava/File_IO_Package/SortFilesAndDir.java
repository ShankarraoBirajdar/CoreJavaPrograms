package File_IO_Package;

import java.io.File;

public class SortFilesAndDir {

	public static void main(String[] args)
	{
		int count2=0,count3=0;
	File ff=new File("c:\\java\\jdk\\bin");
	 
	String[] s=ff.list();
	for(String s1:s)
	{
		File fff=new File(ff,s1);
		if(fff.isFile())
		{
		count2++;
		System.out.println(s1);
		}
		else if(fff.isDirectory())
		{
			count3++;
			System.out.println("\t"+s1);
		}
	}
	System.out.println("totle no of files "+count2);
	System.out.println("totle no of Dir "+count3);

	}

}
