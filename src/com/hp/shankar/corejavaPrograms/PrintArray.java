package com.hp.shankar.corejavaPrograms;

/*i/p-->  enter the no              enter the no
3                       5
o/p                     o/p
3 3 3                    55555
3 1 3                    55155
3 2 3                    55255
3 3 3                    55355
                        55455
                        55555  (give only Odd i/p) */

import java.util.*;

public class PrintArray {
	public static void main(String[] args) {
		int i, j, t, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no");
		n = sc.nextInt();

		t = n / 2;

		if (n % 2 != 0) {
			for (i = 0; i <= n; i++) {
				for (j = 0; j < n; j++) {
					if (i == 0) {
						System.out.print(n + " ");
					} else {
						if (t == j) {
							System.out.print(i + " ");
						} else {
							System.out.print(n + " ");
						}
					}
				}
				System.out.println();
			}
		} else {
			System.out.println("is a even no\n");
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					System.out.print(n);
				}
				System.out.println();
			}

		}
	}

}
