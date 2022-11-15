package InstanceVariable;

public class LocalVarible {
	int a=10;
	static int b=12;
	public static void main(String[] args) {
		LocalVarible lv = new LocalVarible();
//		int x;//Without Initialize Local Variable
		int x=0;
		if (args.length > 0) {
			x = 10;
		}
		System.out.println(lv.a);
		System.out.println(b);
		try {
			System.out.println(x);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		// C.E:variable x might not have been initialized
	}
}
