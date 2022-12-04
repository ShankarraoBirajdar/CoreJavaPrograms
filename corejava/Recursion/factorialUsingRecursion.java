package Recursion;

public class factorialUsingRecursion {

	public static int getFactorial(int n) {

		if (n == 1 || n == 0)
		{
			return 1;
		}

		int a = getFactorial(n - 1);
		int result = n * a;
		return result;
	}

	public static void main(String[] args) {

		System.out.println(getFactorial(5));

	}

}
