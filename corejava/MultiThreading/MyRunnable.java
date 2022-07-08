package MultiThreading;

import java.util.Currency;
import java.util.Locale;

public class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread :"+Thread.currentThread().getName());
			try 
			{
				Thread.sleep(500);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception
	{
		MyRunnable r=new MyRunnable();
		Thread t=new Thread(r);
		t.setName("Child");
		t.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread :"+Thread.currentThread().getName());
			t.sleep(500);
		}

		
	}

}
