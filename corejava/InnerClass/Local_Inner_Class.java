package InnerClass;

class Outers
{
	int a=10;
	static int b=11;
	void m1()
	{
	 int a=100;
		class Inners
		{
			
			void m2()
			{
				System.out.println("Instance variable of outer class="+Outers.this.a);
				System.out.println("Static variable of outer class="+Outers.b);
				System.out.println("Instance variable of m1()="+a);
			}
		}
		Inners i=new Inners();
		i.m2();
	}
}
public class Local_Inner_Class 
{

	public static void main(String[] args)
	{
		Outers o=new Outers();
		o.m1();

	}

}
