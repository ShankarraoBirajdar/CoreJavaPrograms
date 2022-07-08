package MultiThreading;

public class Sleep_Method_Program extends Thread
{
	public void run()
	{
		try {
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread :"+Thread.currentThread().getName());
			
				Thread.sleep(2000);
			
		}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}
	public static void main(String[] args) throws Exception
	{
		Sleep_Method_Program t=new Sleep_Method_Program();
		t.setName("child");
		t.start();
		t.interrupt();
//		for(int i=0;i<5;i++)
//		{
//			System.out.println("Main Thread :"+Thread.currentThread().getName());
//			
//		}
		

	}

}

