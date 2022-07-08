package Interface_program;

interface F1
{
	
	void show();

}
interface F2 extends F1
{
	void show();

}
class ClassInterface implements F2
{
	public void show()
	{
		System.out.println("Implement Interface Method show()");
	}
}
public class MultipleInterface
{

 
	public static void main(String... args)
	{

		F1 F=new ClassInterface();
		F.show();
	    F2 FF= new ClassInterface();
		FF.show();
		

	}

}
