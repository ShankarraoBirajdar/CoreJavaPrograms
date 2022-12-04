package Recursion;

public class Print1toN {

	public static void print(int input,int printUpTo) {

		if(input==printUpTo) {
			return;
		}
		System.out.println(input);
		print(input+1,printUpTo);
	}
	public static void main(String[] args) {


		print(0,20);

	}

}
