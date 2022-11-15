package Abstract;
class SuperClass
{
	
	void show()
	{
		System.out.println("Parent Class");
	}
}
class SubClass extends SuperClass
{
	
	void show()
	{
		System.out.println("Child Class");
	}
}

public class DynamicMethodDispatch 
{

	public static void main(String[] args) 
	{
		SuperClass s=new SuperClass();
		s.show();

		SuperClass s1=new SubClass();
		s1.show();
		

	}

}
