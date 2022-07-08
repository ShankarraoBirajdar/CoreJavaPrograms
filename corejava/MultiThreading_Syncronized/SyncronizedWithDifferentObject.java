package MultiThreading_Syncronized;
/*Class Level Lock: every class in java has a unique lock which is nothing but class level lock.
 * if a thread wants to exicute a static syncronized method then thread required clas level lock
 * once thread got class level lock then it is allow to exicute any static syncronized of that class
 * once method exicution complete automatically thread release the lock */
class Display2
{
	public static synchronized void wish(String name)
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
}
class SThread2 extends Thread
{
	Display2 dd;
	String name;
	SThread2(Display2 dd,String name)
	{
		this.dd=dd;
		this.name=name;
	}
	public void run()
	{
		dd.wish(name);
	}
}

public class SyncronizedWithDifferentObject {

	public static void main(String[] args) 
	{
		Display2 d1=new Display2();
		Display2 d2=new Display2();
		SThread2 t1=new SThread2(d1,"Dhoni");
		SThread2 t2=new SThread2(d2,"Yuvraj");
		t1.start();
		t2.start();
	

	}

}
