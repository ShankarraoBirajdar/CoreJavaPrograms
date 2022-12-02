package LambdaExpressionWithAnonymousClass;

//If an Interface Contain only one Abstract Method in that case  Anonymous Class replaced with  Lambda Expression

abstract class Test {
	abstract void print();
}

interface Test2 {
	void print();
}

class PopCorn {
	public void taste() {
		System.out.println("spicy");
	}
}

public class App {

	int x=888;
	public static void main(String[] args) {
		Test test = new Test() {
			public int x=999;
			public void print() {
				System.out.println("Ths is Anonymous Class - Abstract Class "+this.x);
			}
		};
		test.print();

		Test2 test2 = new Test2() {
			int x=777;
			@Override
			public void print() {
				System.out.println("Ths is Anonymous Class - Interface "+this.x);

			}
		};

		test2.print();

		PopCorn popCorn = new PopCorn() {
			int x=555;
			public void taste() {
				System.out.println("salty "+this.x);
			}
		};
		
		popCorn.taste();//salty	
		PopCorn popCorn1 = new PopCorn();
		popCorn1.taste();//spicy

	}

}
