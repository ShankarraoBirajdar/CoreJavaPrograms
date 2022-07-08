package MultiThreading;

public class MyThread extends Thread 
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread :"+Thread.currentThread().getName());
		}
		
	}
	
	
	

	public static void main(String[] args) throws Exception
	{
//		Thread t1=new Thread();
//		t1.start();
		MyThread t=new MyThread();
		t.setName("child");
		t.start();		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread :"+Thread.currentThread().getName());
		}
		
		

	}

}
