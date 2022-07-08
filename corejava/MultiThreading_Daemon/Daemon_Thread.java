package MultiThreading_Daemon;
/* whenever last daemon thread terminats automatically all daemon threads will be terminated irespective their position
*/
class ChildThreads extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread ");
			try
			{
				Thread.sleep(1000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}
}
public class Daemon_Thread 
{

	public static void main(String[] args) 
	{
		ChildThreads t=new ChildThreads();
		t.setDaemon(true);
		t.start();
		System.out.println("Main Thread"+Thread.currentThread().getName());

	}

}
