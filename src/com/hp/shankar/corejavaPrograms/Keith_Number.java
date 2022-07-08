package com.hp.shankar.corejavaPrograms;

import java.util.Scanner;

public class Keith_Number {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int copy = n;
		String s = Integer.toString(n);
		int d = s.length();
		int[] arr = new int[n];

		for (int i = d - 1; i >= 0; i--) {
			arr[i] = copy % 10;
			copy = copy / 10;
		}
		int i = d, sum = 0;
		while (sum < n) {
			sum = 0;
			for (int j = 1; j <= d; j++) {
				sum = sum + arr[i - j];
			}
			arr[i] = sum;
			i++;
		}
		if (sum == n) {
			System.out.println("is a keith number");
		} else {
			System.out.println("is not a keith number");
		}

	}

}
