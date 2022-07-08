package MultiThreading;

public class JoinAfterMain extends Thread
{
	static Thread mt;
	public void run()
	{

		try
		{
			mt.join();//because of join method child thread go to waiting state exicute after exicuting of Main thread

		} catch (InterruptedException e)
		{
			System.out.println(e);
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread :"+Thread.currentThread().getName());
			//Once Main thread is complete then exicute
			

		}

	}
	public static void main(String[] args) throws Exception
	{
		JoinAfterMain.mt=Thread.currentThread();
		JoinAfterMain t=new JoinAfterMain();
		t.setName("child");
		t.start();//after exicuting of start () two thread are created one child thread and another main thread
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread :"+Thread.currentThread().getName());//here Main thread exicute
          sleep(2000);
		}

	}
}
