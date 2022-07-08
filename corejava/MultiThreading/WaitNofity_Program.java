package MultiThreading;

class c extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("child Thread Start Calculation");
			for(int i=1;i<=100;i++)
			{
				total=total+i;
			}
			System.out.println("child Thread giving notification call");
			this.notify();
		}
		//;;;1 lack code of line
		System.out.println("complete the program");
	}
}


public class WaitNofity_Program 
{

	public static void main(String[] args) throws Exception
	{
		c t=new c();
		t.start();
		Thread.sleep(1000);/*Here Main Thread Is sleep 1 sec*/
		synchronized(t)
		{
			System.out.println("main Thread calling Wait()");
			/*if their is chance of exicuting first child Thread..if first exicute child thread then after
			notify() method he will go dead state and after give chance to main thread to exicute t.wait()...
			beacuse of t.wait() main thread is goto waiting state until give notification from child thread but
			 child thread is already in dead state..then here main thread is not give notification from child thread
			 to overcome this problem set time of waiting state of main thread*/
//			t.wait();
			t.wait(5000);/*Wait only 5 sec*/
			System.out.println("main Thread Got Notification");
			System.out.println(t.total);
		}

	}

}
/*1)two threads can communicate with each other by using
wait()
notfy()
notifyAll()

The Thread which is expecting updation is responsible to call wait() method
then immidiately the thread will entered inti waiting state.

The Thread which is responsible to perform updation
after perform updation it is responsible to call notify
() method then waiting thread will get that notification
and continue its exicution with those updated items. 

2)wait(),notfy(),notifyAll() present in Object class but not in Thread class
beacause Thread can call these method on any java object.

3)To call wait(),notfy(),notifyAll() methods on any object ,Thread should be owner of that object that is thread should has
  Lock of that object that is the thread should be inside synchronized area.hence we can wait(),notfy(),notifyAll() method
  only from synchronized area otherwise we will get run time exception IllegalMoniterStateException.

4)If a Thread calls wait method on any object it immidiately relese lock of that perticuler object and entered into waiting state.

5)If a Thread calls notify method on any object it  relese lock of that  object but may not immidiately,
   except wait(),notfy(),notifyAll() their is no oher method where Thread relese the lock.

Methods in Object class:

1)public final void wait()  throws InterruptedException
2)public final native void wait(long ms) throws InterruptedException
3)public final void wait(long ms,int ns) throws InterruptedException

4)public final native void notify()
5)public final native void notifyAll()

note:every wait() method throws InterruptedException which is checked Exception hence whenever we are using wait method
complusary we should handle this InterruptedException either by try catch or throws keyword otherwise we will get 
compile time error

Producer And Consumer problem

1)producer thread is responsible to produce items to queue and consumer thread is responsile to consume item from Queue.
2)  if queue is empty 
then consumer thread will call wait() method
 and
 entered into waiting state.
  after producing the item to the queue
 produser thread is reponsible to call notify method.
  then waiting consumer will get that notification and continue its exicution with updated items.

notify:
1) we can use notify () method to give the notification for only one waiting thread if
   multiple threads are waiting then only one thread will be notify and
   the remaining thread have to wait for further notication
   which thread will be notify we cant expect it depends on JVM.

notifyAll:
     1)We can use notifyAll() to give the notification for all waiting thread of a perticuler object
       then all waiting thread
       even though multiple thread notified but exicution will be performed one by one because threads required lock
       one only is available

*/




