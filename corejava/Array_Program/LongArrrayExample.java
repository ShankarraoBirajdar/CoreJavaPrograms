package Array_Program;

public class LongArrrayExample
{

	public static void main(String[] args)
	{
		LongArrrayExample l=new LongArrrayExample();
		l.start();

	}
	void start()
	{
		long []a1={3,4,5};
		long []a2=fix(a1);
		System.out.println("a1="+a1[0]+"\t"+a1[1]+"\t"+a1[2]);
		System.out.println("a2="+a2[0]+"\t"+a2[1]+"\t"+a2[2]);
	}
	long []fix(long []a3)
	{
		 a3[1]=7;
		return a3;
	}

}
