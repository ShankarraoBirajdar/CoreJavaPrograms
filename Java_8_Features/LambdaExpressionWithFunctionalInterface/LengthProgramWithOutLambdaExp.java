package LambdaExpressionWithFunctionalInterface;

interface Measurements {
	int getLength(String str);
}

class MyInterface implements Measurements {

	@Override
	public int getLength(String str) {
		
		return str.length();
	}

}


public class LengthProgramWithOutLambdaExp  {

	public static void main(String[] args) {
		Measurements measurement = new MyInterface();
		System.out.println("Length Of String is: "+measurement.getLength("Shankar"));

	}

}
