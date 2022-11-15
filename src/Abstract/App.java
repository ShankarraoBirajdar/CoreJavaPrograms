package Abstract;

abstract class Parent2{
	abstract public void name(); 
	public void name2() {
		System.out.println("Hi");
	}
}


public class App {
	
	public static void main(String[] args) {
		Parent2 parent =new Parent2() {
			
			@Override
			public void name() {
				System.out.println("name2");
				
			}
		};
		
		parent.name2();
	}

}
