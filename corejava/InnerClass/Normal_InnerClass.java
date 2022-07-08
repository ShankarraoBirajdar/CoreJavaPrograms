package InnerClass;

import InnerClass.university.department;

class university
{
	public university()
	{
		
		System.out.println("Outer Class");
	}
	class department
	{
		public department()
		{
			System.out.println("Inner Class");
		}
		void show()
		{
			System.out.println("show() Inner Class");
		}
	}
	void d()
	{
	department d1=new department();//call inner class constructor
	d1.show();//call void show()
	
	}
		
	
}
public class Normal_InnerClass
{
	
	public static void main(String[] args) 
	{
		university u=new university();//call outer class constructor
		university.department d=u.new department(); //call inner class constructor
		u.d();//call void d()
	
		

	}

}
