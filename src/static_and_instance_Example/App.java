package static_and_instance_Example;

public class App {

	private int  a=1010;//Instance Variable
	private static int  b=1011;
	public static void main(String[] args) {
		
		App app = new App();
		app.a++; //We Can Not Call Instance Variable Directly We have to create Object of that class
		System.out.println(app.a);//We Can Not Call Instance Variable Directly We have to create Object of that class

		b++;
		System.out.println(b);
	}

}
