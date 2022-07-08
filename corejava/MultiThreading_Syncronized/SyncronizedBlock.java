package MultiThreading_Syncronized;

/*if few line of code required to set as synchronized then not necessory to set hole method as synchronized
 * beacuse synchronized is wrost type in java it reduce performance of code*/
class DisplayThread
{
	public void wish(String name)
	{
		//			;;;;l lakh line of code
		 synchronized(this)
		{
			for(int i=0;i<=10;i++)
			{
				System.out.print("Good Morning:");

				try
				{
					Thread.sleep(2000);
				}catch(Exception e){}
				System.out.println(name);

			}
		}
		//			;;;;l lakh line of code
	}
}
class MyThreadclass extends Thread
{
	DisplayThread d;
	String name;
	MyThreadclass(DisplayThread d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class SyncronizedBlock 
{

	public static void main(String[] args) throws Exception
	{
		DisplayThread d=new DisplayThread();
		MyThreadclass t1=new MyThreadclass(d,"Dhoni");t1.wait();
		MyThreadclass t2=new MyThreadclass(d,"Yuvraj");
		t1.start();
		t2.start();


	}

}