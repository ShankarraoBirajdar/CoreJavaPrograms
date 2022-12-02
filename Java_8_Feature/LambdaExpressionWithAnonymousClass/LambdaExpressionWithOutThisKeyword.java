package LambdaExpressionWithAnonymousClass;

import ThisAndSuperKeyword.This2;

interface Interf {
	void m1();
}

class Testing{
	int x=888;
	
	public void m2() {
		Interf interf= new Interf() {
			int x=999;
			@Override
			public void m1() {
				System.out.println(this.x);//999
				
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
