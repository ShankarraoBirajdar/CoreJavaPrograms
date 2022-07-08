package ThisAndSuperKeyword;

public class This2 
{
	int a;
	public static void  This2(This2 g) 
	{
      //super();//Constructor call must be the first statement in a constructor
      //this("d");//Constructor call must be the first statement in a constructor
      g.a=10;
	}
//	public This2(String w)
//	{
//		System.out.println(w);
//	}
	public static void m(This2 y)
	{
		y.a=11;
	}
	void a(This2 k)
	{
		System.out.println(this.a);
	}
    
	public static void main(String[] args)
	{
		This2 t=new This2();
		t.a=13;
		t.a(t);
		

	}

}
//ThisAndSuperKeyword.This2@70dea4e
//ThisAndSuperKeyword.This2@70dea4e