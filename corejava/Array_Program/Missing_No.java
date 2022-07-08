package Array_Program;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Missing_No {

	public static void main(String[] args) {
		int a[] = new int[10], n, b, c;
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("Enter Data But Assending Order");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		/* ...................Logic No 1*................... */
		c = a[0];

		for (b = 0; b < n; b++) {

			if (c != a[b]) {
				do {
					System.out.println("missing no-->" + c);
					c++;
				} while (c != a[b]);

			}

			c++;

		}
		/* .................Logic No 2...................... */

		/*
		 * int j=a[0]; int t=a.length; for(int i=0;i<t;i++) { if(a[i]!=j) { j++;
		 * } else { System.out.println("miss"+j); } j++; }
		 */

	}

}
