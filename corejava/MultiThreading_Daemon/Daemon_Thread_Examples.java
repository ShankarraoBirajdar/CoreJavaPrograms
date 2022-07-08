package MultiThreading_Daemon;

class MyThreads extends Thread
{
	
}
public class Daemon_Thread_Examples
{

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().isDaemon());
//		Thread.currentThread().setDaemon(true);
		/*IllegalThreadStateException raised
		It is impossible to change daemon nature of main thread, because  it is already started by JVM at begining .*/
		
		MyThreads t=new MyThreads();
		
		System.out.println(t.isDaemon());/*if parent thread is non-daemon then automatically chlid 
		                                    thread also non-daemon.*/
		t.setDaemon(true);/*It is possible to change  daemon to child thread */
		
		System.out.println(t.isDaemon());/*True*/

	}

}
