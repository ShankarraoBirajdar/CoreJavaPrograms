package Abstract;
class Base
{
	void show(String s)
	{
		System.out.println("Base Class Constructor():: "+s);
	}
}
class Derived extends Base
{
	void show(int a)
	{
		System.out.println("Derived Class Constructor():: "+a);
	}
}

public class OverridingInDifferentClass {

	public static void main(String[] args)
	{
		Derived d=new Derived();
		d.show("Object");
		d.show(5);


	}

}
