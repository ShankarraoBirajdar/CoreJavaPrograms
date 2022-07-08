package MultiThreading_Daemon;

class Algo extends Thread
{
	public void run()
	{
		System.out.println("Java");
	}
}
public class Example2  {

	public static void main(String[] args)
	{
		Algo a=new Algo();
		
		a.setDaemon(true);
		a.start();
		System.out.println("Program");

	}

}
