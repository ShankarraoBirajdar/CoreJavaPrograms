
package ExceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

class A
{
	void show() throws IOException, SQLException
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	void show() throws IOException,ArithmeticException,SQLException
	{
		System.out.println("Class B");
	}
}
public class ExceptionWithOverriden {

	public static void main(String[] args) throws IOException
	{
		A a=new A();
		try
		{
			a.show();
		} catch (Exception e)
		{
		
			System.out.println(e);
		}
		A a1= new B();
		try
		{
			a1.show();
		} catch (Exception e)
		{
		
			System.out.println(e);
		} 
			

	}

}
//here ArithmeticException is unchecked Exception
//SQLException,IOException is checked Exception