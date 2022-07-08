package MultiThreading_Syncronized;
/*
 
*. case 1:if we are not decalring  wish method as 
       syncronized then both thread will be exicute
       simlutaneously and hence we will get irreguler o/p .

*.case 2:if we declare wish method as syncronized then
       at a time only one thread is allowed to exicute 
       wish method and given display object hence we will get reguler o/p

*.Syncronization:If multiple Thread are accsess/operrating to the same java object 
               then Data Consistancy are occur to overcome this problem
               we use Syncronization concept.
               
 *.case 3: If multiple Thread are not accsess/operrating to the same java objec then syncronized is not required.

*."syncronized" is keyword or modifire use only method and block not for class or variable.
 
 
 
 */

class Display
{
	public synchronized void wish(String name)
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
class SThread extends Thread
{
	Display d;
	String name;
	SThread(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class SyncronizedDemo
{

	public static void main(String[] args)
	{
		Display d=new Display();
		SThread t1=new SThread(d,"Dhoni");
		SThread t2=new SThread(d,"Yuvraj");
		SThread t3=new SThread(d,"Kohli");
		SThread t4=new SThread(d,"Raina");
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
