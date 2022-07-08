package File_IO_Package;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeClass {

	public static void main(String[] args) throws IOException
	{
		Runtime rt=Runtime.getRuntime();
		//rt.halt(0);//forcibly sop jvm exicute next command
		System.out.println(rt.availableProcessors());//show no of process available in jvm
		System.out.println(rt.freeMemory()+" Bytes");
		System.out.println(rt.totalMemory()+" Bytes");
		System.out.println(rt.maxMemory()+" Bytes");
		//rt.load("abc.txt");
		//rt.exec("cmd /c start");/*access command prompt thought java program*/
		//rt.exec("notepad abc.txt");/*access notepad thought java program but current directory*/
		//rt.exec("notepad E:\\Eclipse\\Programs\\CoreJava\\IO\\f.txt");/*anywhere in harddisk*/
		//rt.exec("explorer.exe");/*by default show all drive*/
		//rt.exec("explorer.exe E:\\Eclipse\\Programs\\CoreJava");
		System.out.println("Enter digit in Byte");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		double n=Integer.parseInt(br.readLine());
		double bit=8;
		double B=bit*n;
		double KB=n/1024;
		double M=KB/1024;
		System.out.println(n+" Byte= "+B+" BIT");
		System.out.println(n+" Byte= "+KB+" KB");
		System.out.println(n+" Byte= "+M+" MB");
		



	}

}
