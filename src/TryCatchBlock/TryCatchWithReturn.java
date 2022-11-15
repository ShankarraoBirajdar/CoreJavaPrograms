package TryCatchBlock;

public class TryCatchWithReturn {
	
	public static String name() {
		
		try {
			System.out.println("This is try Block");
			return "My Name Is Shankar";
		}catch (Exception e) {
			System.out.println("This is catch Block");
			return "My Name Is Priyanka";
		}finally {
			System.out.println("This is Finally Block");
		}
	
		
	}
	
public static String name2() {
		
		try {
			System.out.println("This is try Block");
			return "My Name Is try";
		}catch (Exception e) {
			System.out.println("This is catch Block");
			return "My Name Is catch";
		}finally {
			System.out.println("This is Finally Block");
			return "My Name Is finally";
		}
		
	}

	public static void main(String[] args) {
		System.out.println("name() "+name());
		System.out.println("name2() "+name2());

	}

}
