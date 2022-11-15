package TryCatchBlock;

public class TryCatch {

	public static void main(String[] args)  {

		try {

			try {
				try {
					int[] arr = { 1, 2 };
					System.out.println(arr[3]);
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(10 / 0);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

			String str = null;
			System.out.println(str.equals("good"));

		} catch (NullPointerException|ArithmeticException e) {
			System.out.println(e.getMessage());
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
