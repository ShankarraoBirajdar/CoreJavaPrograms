package Two_D_Array_program;

/*Triplet i/p--> 1 2 3 4 5  o/pEnter the Input 6
 * Triplet number are= 1+2+3=6*/
import java.util.Scanner;

public class Triplet {

	public static void main(String[] args) {
		int m, i, k, h, n, sum = 0, n1;
		int a[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		for (i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the Input");
		n1 = sc.nextInt();
		for (m = 0; m < n; m++)
		{
			for (k = m + 1; k < n; k++)
			{
				for (h = k + 1; h < n; h++) {

					sum = a[m] + a[k] + a[h];

					if (n1 == sum)
					{
						System.out.println("Triplet number are= " + a[m] + "+" + a[k] + "+" + a[h] + "=" + sum);
						continue;
					}

				}

			}
		}

	}

}
