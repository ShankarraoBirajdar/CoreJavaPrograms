package Inheritance_program;
class SuperHome
{
	SuperHome()
	{
		System.out.println("Super Class Constructor");
	}
	
}
class SubHome extends SuperHome
{
	SubHome ()
	{
		System.out.println("Sub Class Constructor");
	}
	
}
public class ConstructorPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println();
		SuperHome s=new SuperHome();
		

		SuperHome s1=new SubHome();
		
	}

}
