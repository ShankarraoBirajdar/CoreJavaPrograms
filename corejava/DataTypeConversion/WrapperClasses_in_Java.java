package DataTypeConversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WrapperClasses_in_Java {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the Data-->Int, Char, String ,Double, Float,byte\naccept in String Form");
		String s1=br.readLine(); 
		
		/*String Convert Integer*/
		try{
		int i=Integer.parseInt(s1);
		System.out.println(i);}catch(Exception e){System.out.println("Out of Range-->MIN="+Integer.MIN_VALUE+" MAX="+Integer.MAX_VALUE+" SIZE="+Integer.SIZE);}
		
		/*String Convert Float*/
		try{
		float f=Float.parseFloat(s1);
		System.out.println(f);}catch(Exception e){System.out.println("Out of Range-->MIN="+Float.MIN_VALUE+" MAX="+Float.MAX_VALUE+" SIZE="+Float.SIZE);}
		
		/*String Convert Double*/
		try{
		double d=Double.parseDouble(s1);
		System.out.println(d);}catch(Exception e){System.out.println("Out of Range-->MIN="+Double.MIN_VALUE+" MAX="+Double.MAX_VALUE+" SIZE="+Double.SIZE);}
		
		/*String Convert Byte*/
		try{
		byte b=Byte.parseByte(s1);
		System.out.println(b);}catch(Exception e){System.out.println("Out of Range-->MIN="+Byte.MIN_VALUE+" MAX="+Byte.MAX_VALUE+" SIZE="+Byte.SIZE);}
		
		
		
	}

}
