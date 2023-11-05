package MethodAndConstructorReference;

public class MethodReferenceExample2 {
	
	public static void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("withMethodReference() Child Thread:: "+Thread.currentThread());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withLambdaExpression();
		withMethodReference();
	}
	
	public static void withMethodReference() {
		Runnable runnable = MethodReferenceExample2::m1;
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("withMethodReference() Main Thread:: "+Thread.currentThread());
		}
	}
	
	public static void withLambdaExpression() {
		
		Runnable runnable = ()->{
			for (int i = 0; i < 10; i++) {
				System.out.println("withLambdaExpression() Child Thread:: "+Thread.currentThread());
			}
		};
		
//		runnable.run();
		
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("withLambdaExpression() Main Thread:: "+Thread.currentThread());
		}
	}

}
