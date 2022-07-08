package MultiThreading;

class B extends Thread
{
	int total=0;
	public void run()
	{
		for(int i=1;i<=100;i++)/*to exicute for loop or iterating 100 time required only sleep(1) nano second*/
		{
			total=total+i;
//			Thread.yield();/*to pause current thread and give chance to exicute of waiting thread of a same priority*/
		}
		//;;;1 lack code of line
	}
}
public class TotalAditionWithThread {

	public static void main(String[] args) throws Exception
	{
		B t=new B();
		t.start();
//		t.join(); /*after completing child thread operation main thread will join*/
//		t.sleep(1000);/*sleep some millisecond*/
		System.out.println(t.total);

	}

}
