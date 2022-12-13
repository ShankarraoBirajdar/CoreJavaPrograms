package StaticMethod;

interface Interf2 {
	public static void sum(int a, int b) {
		System.out.println("The Sum:" + (a + b));
	}

}

class Test implements Interf2 {
	public static void main(String[] args) {
		Test t = new Test();
		//t.sum(10, 20); // CE
		//Test.sum(10, 20); // CE
		Interf2.sum(10, 20);
	}


}
