package Array_Program;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int i, j, n, c, temp = 0;
		int a[] = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}

		System.out.println("Reverse Order");
		for (i = n - 1; i >= 0; --i) {
			System.out.println("a[" + i + "]=" + a[i]);

		}

	}

}
