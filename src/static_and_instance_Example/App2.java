package static_and_instance_Example;

public class App2 {

	private int a=10;
	private static int b=10;
	
	public App2(String ObjName) {

		a++;
		b++;
		System.out.println("a= "+a+" from "+ObjName);
		System.out.println("b= "+b+" from "+ObjName);

	}
	public static void main(String[] args) {
	
		App2 app1 = new App2("app1");
		App2 app2 = new App2("app2");
		App2 app3 = new App2("app3");

	}

}
