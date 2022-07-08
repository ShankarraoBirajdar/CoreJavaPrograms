package Collection_Program.List;
class n implements Runnable
{
	Thread t;
//	String namr;
	public n() {
		// TODO Auto-generated constructor stub
//		namr=n;
		t=new Thread(this,"hi");
		t.start();
		
	}
	public void run()
	{
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t);
	}
}
public class Exexexex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new n();
		
//		n q1=new n("one");
//		n q2=new n("two");
//		try
//		{
////			q1.t.wait();
//			Thread.sleep(1000);
//			System.out.println(q1.t.isAlive());
//		}catch(Exception e)
//		{
//			System.out.println(e);
//		}
	}
//interface h
//{
//	public static  int g=10;
//}
}
