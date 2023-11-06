package LambdaExpressionWithFunctionalInterface;


@FunctionalInterface
interface Measurement {
	int getLength(String str);
}

public class LengthProgramWithLambdaExp {

	public static void main(String[] args) {
		Measurement measurement = (str) -> str.length();
		System.out.println("Length Of String is: "+measurement.getLength("Shankar"));

	}

}
