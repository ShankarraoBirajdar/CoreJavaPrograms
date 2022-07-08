package MultiThreading;

public class Interuupt_Method extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	System.out.println("I want to go sleep");
		try 
		{
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) 
	{
		Interuupt_Method t=new Interuupt_Method();
		t.start();
		t.interrupt();
		System.out.println("it is main Thread");

	}

}
