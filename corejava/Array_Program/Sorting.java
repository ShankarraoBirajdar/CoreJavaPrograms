package Array_Program;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		for (i = 0; i < n; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}

	}

}
