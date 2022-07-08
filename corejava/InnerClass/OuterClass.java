package InnerClass;

public class OuterClass
{
	int a=10;
	class InnerClass
	{
	
		void m1()
		{ 
			System.out.println(a);
			System.out.println("m1() In Inner Class");
			
		}
	}
	void m2()
	{
		InnerClass i=new InnerClass();
		i.m1();
		System.out.println("m2() In Outer Class");
	}

	public static void main(String[] args)
	{
		OuterClass o=new OuterClass();
		o.m2();

	}

}
