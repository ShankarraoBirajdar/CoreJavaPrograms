package MultiThreading;
/* we want to join with our second thread but after 
  exicuting of first thread then use join method*/
public class JoinMethod_Program extends Thread
{

	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread :"+Thread.currentThread().getName());//here child thread exicute
			try {
				Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) throws Exception
	{
		JoinMethod_Program t=new JoinMethod_Program();
		t.setName("child");
		t.start();//after exicuting of start () two thread are created one child thread and another main thread
		t.join(10000);//because of join method main thread go to waiting state exicute after exicuting of child thread
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread :"+Thread.currentThread().getName());//Once child thread is complete then exicute
			
		}
		
	}
	
}	
