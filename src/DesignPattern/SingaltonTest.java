package DesignPattern;

class Singalton {

	private static Singalton singaltonObj = null;

	private Singalton() {

	}

	public static Singalton getInstance() {
		if (singaltonObj == null) {
			singaltonObj = new Singalton();
		}
		return singaltonObj;

	}

}

class SingaltonTest {

	public static void main(String[] args) {

		Singalton obj = Singalton.getInstance();
		System.out.println(obj);
		Singalton obj1 = Singalton.getInstance();
		System.out.println(obj1);
		Singalton obj2 = Singalton.getInstance();
		System.out.println(obj2);
	}
}
