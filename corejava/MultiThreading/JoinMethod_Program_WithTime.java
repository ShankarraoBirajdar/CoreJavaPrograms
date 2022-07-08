package MultiThreading;

public class JoinMethod_Program_WithTime extends Thread
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
		JoinMethod_Program_WithTime t=new JoinMethod_Program_WithTime();
		t.setName("child");
		t.start();//after exicuting of start () two thread are created one child thread and another main thread
		t.join(5000);//because of join method main thread go to waiting state exicute after compliting 5000 second
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread :"+Thread.currentThread().getName());//exicute after compliting 5000 second
			
		}
		
	}
	
}	
