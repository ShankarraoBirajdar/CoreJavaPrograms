package TryWithResourcesEnhancements;

class MyResource implements AutoCloseable{

	public MyResource() {
		System.out.println("Resource Creation...");
	}
	
	public void doProcess() {
		System.out.println("Resource Processing...");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("Resource closing...");
	}
	
}
public class Example2  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Program Execution With preJDK7");
		preJDK7();
		
		System.out.println("Program Execution With JDK7");
		JDK7();
		
		System.out.println("Program Execution With JDK9");
		JDK9();
		
		System.out.println("Program Execution Multiple Resource With JDK9");
		multipleJDK9();
	}
	
	public static void preJDK7() throws Exception {
		MyResource resource=null;
		try {
			resource=new MyResource();
			resource.doProcess();
		} catch (Exception e) {
			System.out.println("Handing: "+e);
		} finally {
			if (resource!=null) {
				resource.close();
			}
		}
	}
	
	public static void JDK7() {
		try(MyResource resource=new MyResource()){
			resource.doProcess();
		} catch (Exception e) {
			System.out.println("Handing: "+e);
		} 
		//not using finally automatic closing close()
	}
	
	public static void JDK9() {
		MyResource resource=new MyResource();
		try(resource){
			resource.doProcess();
		} catch (Exception e) {
			System.out.println("Handing: "+e);
		} 
	}
	
	public static void multipleJDK9() {
		MyResource resource1=new MyResource();
		MyResource resource2=new MyResource();
		MyResource resource3=new MyResource();
		MyResource resource4=new MyResource();
		try(resource1;resource2;resource3;resource4){
			resource1.doProcess();
			resource2.doProcess();
			resource3.doProcess();
			resource4.doProcess();
		} catch (Exception e) {
			System.out.println("Handing: "+e);
		} 
	}

}
