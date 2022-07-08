package Array_Program;

import java.util.Scanner;

public class ConcatTwoArray {

	public static void main(String[] args) {
		int i, j, n, c, temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		n = sc.nextInt();
		int a[] = new int[n * 3];
		for (i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}

		System.out.println("Enter the size of second array");
		c = sc.nextInt();
		int b[] = new int[c * 3];
		for (i = 0; i < c; i++) {
			System.out.print("a[" + i + "]=");
			b[i] = sc.nextInt();
		}
		System.out.println("Concatinated array is");
		// n=n+c;

		int n1 = n + c;
		j = 0;
		for (i = n; i < n1; i++) {
			a[i] = b[j];
			j++;

		}
		for (i = 0; i < n1; i++) {
			System.out.println("a[" + i + "]=" + a[i]);
		}

	}

}
