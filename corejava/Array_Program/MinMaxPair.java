package Array_Program;

import java.util.Scanner;

public class MinMaxPair {

	public static void main(String[] args) {
		int i, n, c, temp;
		int a[] = new int[20];
		int min[] = new int[20];
		int mid[] = new int[20];
		int max[] = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		if (n % 2 != 0) {
			System.out.println("Enter The Elements:");
			for (i = 0; i < n; i++) {
				System.out.print("a[" + i + "]=");
				a[i] = sc.nextInt();
			}
			int n1 = n / 2;
			for (i = 0; i < n; i++) {
				if (a[n1] > a[i]) {
					System.out.print("min=" + a[i]);
				}
				if (a[i] > a[n1]) {
					System.out.print("max=" + a[i]);
				}
				System.out.print("\n");
			}
			System.out.print("\nmid=" + a[n1]);
		} else {
			System.out.println("Plz Enter Odd Size");
		}

	}

}
