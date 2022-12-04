package Recursion;

public class PrintNto1 {

	public static void print(int input,int printUpTo) {

		if(input==printUpTo) {
			return;
		}
		System.out.println(input);
		print(input-1,printUpTo);
	}
	public static void main(String[] args) {


		print(20,0);

	}

}
