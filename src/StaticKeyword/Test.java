package StaticKeyword;


class Parent{
	public static void sum(int a) {
		System.out.println(a+" from Parent");
	}
}
class Child extends Parent {
	
	public static void sum(int a) {
		System.out.println(a+" from Child");
	}
	
}


class Test{
	public static void main(String[] args) {
		
		int x=4;
		
		switch (x) {
		case 0:System.out.println(0);
		case 1:System.out.println(1);break;
		case 2:System.out.println(2);
		case 3:System.out.println(3);
			
		default:System.out.println("def");
			
		}
		
	
	}
}



