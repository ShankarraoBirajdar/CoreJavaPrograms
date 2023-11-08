package DiamondOperatorEnhancements;

class MyGenClass<T>{
	T obj;
	 public MyGenClass(T obj) {
		this.obj = obj;
	}
	 
	 public T getObj() {
		return obj;
	}
	 public void process() {
		System.out.println("Processing Obj..");
	}
}

public class Example2 {

	public static void main(String[] args) {
		
		//1.7v
		MyGenClass<String> class1 = new MyGenClass<String>("Shankar") {
			 public void process() {
					System.out.println("Processing... "+getObj());
				}
		};
		class1.process();
		
		//1.9v
		MyGenClass<String> class2 = new MyGenClass<>("Aman") {
			 public void process() {
					System.out.println("Processing... "+getObj());
				}
		};
		class2.process();

	}

}
