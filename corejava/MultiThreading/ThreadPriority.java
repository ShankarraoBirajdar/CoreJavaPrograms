package MultiThreading;

public class ThreadPriority extends Thread 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread :"+i);
		}
	}

	public static void main(String[] args) throws Exception
	{
		ThreadPriority t=new ThreadPriority();
		Thread t1=new Thread(t);
		t1.setName("child");
		t1.setPriority(10);
		t1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread :"+i );
			
		}

	}

}
