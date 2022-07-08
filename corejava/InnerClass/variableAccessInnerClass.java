package InnerClass;



public class variableAccessInnerClass 
{
	int a=10;
	static int b=11;
	class A
	{
		int a=100;
		void m1()
		{ 
			int a=1000;
			System.out.println("Instance variable of outer class="+variableAccessInnerClass.this.a);
			System.out.println("Static variable of outer class="+variableAccessInnerClass.b);
			System.out.println("Instance variable of Inner class="+this.a);
			System.out.println("m1() Local Variable="+a);
		}
	}

	public static void main(String[] args)
	{
		new variableAccessInnerClass().new A().m1();

	}

}
