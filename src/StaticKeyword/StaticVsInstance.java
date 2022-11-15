package StaticKeyword;

public class StaticVsInstance {

	int x=10;
	static int y=20;
	public static void main(String[] args)
	{
		StaticVsInstance t1=new StaticVsInstance();
	t1.x=888;
	t1.y=999;
	StaticVsInstance t2=new StaticVsInstance();
	System.out.println(t2.x+"----"+t2.y);//10----999
	}

}


