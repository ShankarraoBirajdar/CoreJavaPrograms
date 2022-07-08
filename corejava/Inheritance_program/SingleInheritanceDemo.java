package Inheritance_program;class BaseClass
{
	int side;
	void setSide(int side)
	{
		this.side=side;
		System.out.println("this is base class:: ");
	}
}
class DerivedClass extends BaseClass
{
	
	void display1()
	{
		System.out.println("area of square :: "+side*side);
		System.out.println("this is dervired class");
	}
}
public class SingleInheritanceDemo 
{
	public static void main(String[] args) {
		DerivedClass D = new DerivedClass();
		D.setSide(25);
		D.display1();
		
	}
}
