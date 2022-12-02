package LambdaExpressionWithAnonymousClass;

class Outer{
	int x=999;
	int y=111;
	public void outerMethod() {
		System.out.println("Outer Method "+this.x+" = "+x+" = "+y);
	}
	
	class Inner{
		int x=666;
		int z=555;
		public void innerMethod() {
			System.out.println("Inner Method "+this.x+" = "+x+" = "+z);
		}
	}
}
public class InnerClassExample {

	public static void main(String[] args) {
		Outer outer=new Outer();
		outer.outerMethod();
		
		Outer.Inner inner = outer.new Inner();
		inner.innerMethod();

	}

}
