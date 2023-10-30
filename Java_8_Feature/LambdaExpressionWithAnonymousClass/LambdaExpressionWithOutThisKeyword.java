package LambdaExpressionWithAnonymousClass;

import ThisAndSuperKeyword.This2;

interface Interf2 {
	void m1();
}

class Testing{
	int x=888;
	
	public void m2() {
		Interf2 interf= new Interf2() {
			int x=999;
			@Override
			public void m1() {
				System.out.println(x);//999
				System.out.println(this.x);//999
				Testing testing =new Testing();
				System.out.println(testing.x);//888
				
			}
		};
		interf.m1();
	}
}
public class LambdaExpressionWithOutThisKeyword {

	public static void main(String[] args) {
		
		Testing test=new Testing();
		test.m2();

	}

}
