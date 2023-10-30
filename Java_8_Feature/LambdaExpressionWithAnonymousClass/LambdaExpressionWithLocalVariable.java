package LambdaExpressionWithAnonymousClass;

interface InterfaceDemo{
	void m1();
}


public class LambdaExpressionWithLocalVariable {
	int instanceVaribale = 10;
	public void m2() {
		int localVaribale = 20;
		InterfaceDemo i = () -> {
			instanceVaribale = 30;
			//localVaribale = 40;//CE: Local variable localVaribale defined in an enclosing scope must be final or effectively final
			System.out.println(instanceVaribale);
			System.out.println(localVaribale);
		};
		i.m1();
	}
	public static void main(String[] args) {
		LambdaExpressionWithLocalVariable l = new LambdaExpressionWithLocalVariable();
		l.m2();
	}

}
