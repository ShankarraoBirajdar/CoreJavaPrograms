package Array_Program;

import java.util.Scanner;

public class MinMaxOfArray {

	public static void main(String[] args) {
		int i, n, c, temp;
		int a[] = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		System.out.println("Enter The Elements:");
		for (i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		int min = a[0];
		int max = a[0];
		for (i = 0; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("\tMin=" + min + "\tMax=" + max);

	}

}
