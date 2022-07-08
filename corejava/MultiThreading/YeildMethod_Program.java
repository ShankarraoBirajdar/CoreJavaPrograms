package MultiThreading;
/*to pause current thread and give chance to exicute of waiting thread of a same priority*/
public class YeildMethod_Program extends Thread
{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread :"+Thread.currentThread().getName());//here child thread exicute
			Thread.yield();
		}
		
	}

	public static void main(String[] args) throws Exception
	{
		
		YeildMethod_Program t=new YeildMethod_Program();
		t.setName("child");
		t.start();//after exicuting of start () two thread are created one child thread and another main thread
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread :"+Thread.currentThread().getName());//here main thread exicute
			
		}
		
	}
	
}	