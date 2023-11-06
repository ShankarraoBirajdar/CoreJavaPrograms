package MethodAndConstructorReference;

class Sample{
	public Sample() {
		System.out.println("Sample Constructor Execution and Object Creation");
	}
}

//syntax 
//ClassName :: new   - new is a keyword

interface Animal{
	public Sample get();
}
public class ConstructorReferenceByDoubleColon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		withLambdaExpression();
		withConstructorReference();
	}
	
	public static void withLambdaExpression() {
		Animal animal = ()->{
			Sample sample = new Sample();
			return sample;
		};
		
		Sample sample = animal.get();
	}
	
	public static void withConstructorReference() {
		Animal animal =Sample :: new ;
		
		Sample sample = animal.get();
	}

}
