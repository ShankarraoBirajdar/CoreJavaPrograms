package TypeCastOperator;

public class ExplicitTypeCasting {

	public static void main(String[] args) {
		int x = 130;
		byte b = (byte) x;
		short s=(short)x;
		System.out.println(b); // -126
		System.out.println(s); //130

	}

}
