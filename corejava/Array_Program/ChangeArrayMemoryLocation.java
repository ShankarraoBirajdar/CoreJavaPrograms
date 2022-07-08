package Array_Program;

import java.util.Scanner;

public class ChangeArrayMemoryLocation {

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

		System.out.println("memory Order");
		j = n - 1;
		for (i = 0; i < j; i++) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			j--;
		}
		for (i = 0; i <= n - 1; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}

	}
}
