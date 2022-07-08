package com.hp.shankar.corejavaPrograms;

public class StaticKeywaordExample {
static int a=10;
	
	static 
	{
		System.out.print("m1() from 1st static function=> ");
		m1();//[Read Indirectly Write Only]
		System.out.println("static block 1--->a="+a);
	}
	public static void m1()
	{
		System.out.println("b="+b);
	}
	static int b=100;

	public static void main(String[] args)
	{
		System.out.print("m1() from 1st main function=> ");
		m1();
		System.out.println("a="+a+" b="+b);
	}
	static
	{
		System.out.println("static block 2--->a="+a+" b="+b);
	}

}
