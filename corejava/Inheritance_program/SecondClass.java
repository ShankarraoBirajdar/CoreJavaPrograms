/*write a program on super keyword*/ package Inheritance_program;

class FirstClass 
{
int data;
	 FirstClass (int x)
	{
		data=x;
		System.out.println("Inside Super Class");

	}
}
public class SecondClass extends FirstClass
{
int data;
	public SecondClass()
	{
		super(10);//super constructor
		data=20;
		System.out.println("Inside Sub Class");

	}
	void displayData()
	{
		System.out.println("Super Data"+super.data);//super keyword
		System.out.println("Sub Data"+data);
	}

	public static void main(String[] args)
	{
		SecondClass d=new SecondClass();
		d.displayData();


	}

}
