package Interface_program;
 interface InterfaceDemo1
{
	void show();

}
class ImplementInterface implements InterfaceDemo1
{
	public void show()
	{
		System.out.println("Implement Interface Method show()");
	}
}
 public class InterfaceDemoClass
{
	

	public static void main(String... args)
	{

		InterfaceDemo1 I=new ImplementInterface();
		I.show();
		ImplementInterface I2= new ImplementInterface();
		I2.show();
		

	}

}

