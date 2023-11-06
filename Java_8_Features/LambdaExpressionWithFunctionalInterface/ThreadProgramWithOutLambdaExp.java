package LambdaExpressionWithFunctionalInterface;

import java.util.Iterator;

class MyRunnable implements Runnable{
	@Override
	public void run() {

        for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
		
	}
}

public class ThreadProgramWithOutLambdaExp  {

	public static void main(String[] args) {
		
		Runnable runnable = new MyRunnable();
		Thread thread=new Thread(runnable);
		
		thread.start();
		  for (int i = 0; i < 10; i++) {
				System.out.println("Main Thread");
			}
	}

	

}
