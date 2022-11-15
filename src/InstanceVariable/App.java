package InstanceVariable;

public class App {

	int instanceVariable = 10;
	static int staticVariable = 20;

	public static void main(String[] args) {
       int localVariable=30;
       
      
       
       App app = new App();
       System.out.println(app.instanceVariable);
       
       
       System.out.println(staticVariable);
       System.out.println(localVariable);
	}

}
