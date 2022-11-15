package Class;

class parent{
	public parent(int id) {
		System.out.println(id+" this is a Parent Class Constructor "+this.hashCode());
	}
}

class child extends parent{
	public child(int id, int age, String name) {
		super(id);
		System.out.println(id+" "+age+" "+name+" "+"this is a Child Class Constructor "+this.hashCode());
	}
}

public class App {

	public static void main(String[] args) {
		child c  = new child(1,27,"Shankar");
		

	}

}
