package Array_Program;

import java.util.Scanner;

public class BinaryArrayEx {
	
	public static void main(String[] args) {
		
		 int i, n, c, temp;
		 int a[] = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}

		for (i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++)

			{
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}
		System.out.println("Sorted Data");
		for (i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}
		System.out.println("memory Order");
		int j = n - 1;
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
