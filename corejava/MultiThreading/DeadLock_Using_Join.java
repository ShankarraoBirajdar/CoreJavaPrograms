package MultiThreading;

public class DeadLock_Using_Join extends Thread {
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
//		Thread.currentThread().join();main thread exicute this line but condition
//		is after complelet exicution of current thread thean we join
		DeadLock_Using_Join.mt=Thread.currentThread();
		DeadLock_Using_Join t=new DeadLock_Using_Join();
		t.setName("child");
		t.start();//after exicuting of start () two thread are created one child thread and another main thread
		t.join();//because join we enter deadLock situation
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread :"+Thread.currentThread().getName());//here Main thread exicute
          sleep(2000);
		}

	}

}
