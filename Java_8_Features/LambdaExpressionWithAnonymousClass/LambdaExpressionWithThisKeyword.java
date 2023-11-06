package LambdaExpressionWithAnonymousClass;



interface Vehical {
	void m1();
}

class Adapter{
	int x=888;
	
	public void m2() {
		Vehical interf= () -> {
				int x=999;
				int y=777;
				System.out.println(x);//999
				System.out.println(this.x);//888
				System.out.println(y);//777
				
			};

		interf.m1();
	}
}
public class LambdaExpressionWithThisKeyword {

	public static void main(String[] args) {
		
		Adapter test=new Adapter();
		test.m2();

	}

}
