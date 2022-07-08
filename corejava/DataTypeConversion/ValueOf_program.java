package DataTypeConversion;

public class ValueOf_program {

	public static void main(String[] args)
	{
		String s;
		
		int i=99;
		s=String.valueOf(i);//Behind valueOf method this code -->Integer.toString(i);
		System.out.println(s);
		
		float f=3.14f;
		s=String.valueOf(f);//Behind valueOf method this code -->Float.toString(i);
		System.out.println(s);
		
		double d=10.44;
		s=String.valueOf(d);
		System.out.println(s);
		
		char c='C';
		s=String.valueOf(c);
		System.out.println(s);
		
		short sh=10;
		s=String.valueOf(sh);
		System.out.println(s);
		
		long l=100000000000l;
		s=String.valueOf(l);
		System.out.println(s);
		
		byte b=127;
		s=String.valueOf(b);
		System.out.println(s);
		
		boolean t=true;   //t ? "true" : "false";
		s=String.valueOf(t);
		System.out.println(s);
		
	    String hh="50";
		int xx=Integer.valueOf(hh);
		System.out.println(xx);
	}

}
