package ThreadExamples;

 class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Run Method");
	}
}

class ThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();// Instantiation of a Thread
		Thread thread=new Thread(t);
		thread.start();// starting of a Thread
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread");
		}
	}
}
