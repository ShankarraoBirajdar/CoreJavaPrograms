package File_IO_Package;
import java.io.*;

public class BufferedWriter_Operation {

	public static void main(String[] args) throws IOException
	{
		File f=new File("yevle");
		f.mkdir();
		File f1=new File(f,"ram.txt");
		f1.createNewFile();
		FileWriter fr=new FileWriter(f1);
		BufferedWriter bw=new BufferedWriter(fr);
		bw.write("HI");
		bw.newLine();
		bw.write("Ram");
		bw.newLine();
		bw.write("......");
		bw.newLine();
		bw.write(65);
		bw.newLine();
		bw.flush();
		bw.close();
		//fr.close();
		Runtime rt=Runtime.getRuntime();
		//rt.halt(0);
		//System.out.println(rt.availableProcessors());
		//rt.exec("cmd /c start");/*access command prompt throught java program*/
		//rt.exec("notepad abc.txt");/*access notepad throught java program but current directory*/
		//rt.exec("explorer.exe");/*by default show all drive*/
	    rt.exec("explorer.exe E:\\Eclipse\\Programs\\CoreJava");
		rt.exec("notepad E:\\Eclipse\\Programs\\CoreJava\\yevle\\ram.txt");/*Anywhere in harddisk*/
		
		
		

	}

}
