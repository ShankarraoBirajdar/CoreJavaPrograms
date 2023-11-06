package LambdaExpressionWithAnonymousClass;

//If an Interface Contain only one Abstract Method in that case  Anonymous Class replaced with  Lambda Expression
public class ThreadProgramWithLambdaExp {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Thread");
			}
		};
		
//		Thread thread = new Thread(() -> {
//			for (int i = 0; i < 10; i++) {
//				System.out.println("Child Thread");
//			}
//		});
		
		Thread thread = new Thread(runnable);

		thread.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

	}

}
