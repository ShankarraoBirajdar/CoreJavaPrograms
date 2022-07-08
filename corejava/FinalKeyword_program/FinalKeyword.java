package FinalKeyword_program; 
final public class FinalKeyword 
{
	final int x;//final blank variable-->initialization possible in a instance block but only once
	{
		x=99;
	}
	
final int a;//final blank variable-->initialization possible in a constructor but only once

final int b=20;//final variable 
final static int c;//static final blank variable initialization possible in a static block but only once

     static
    {
	  c=30;
    }
	public FinalKeyword() 
	{
		a=10;
	}

	final void disp()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(x);

	}
	public static void main(String[] args) 
	{
		FinalKeyword f=new FinalKeyword();
		f.disp();
	}

}
