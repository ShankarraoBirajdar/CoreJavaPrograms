package Array_Program;

import java.io.IOException;
import java.util.Scanner;;

public class DuplicateNotAllowed {

	public static void main(String[] args) throws IOException {
		int i, n, count = 0, j, temp = 0;
		Integer m = Integer.MIN_VALUE;// m=-2147483648

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of first array");
		n = sc.nextInt();
		int a[] = new int[n];// {1,2,2,3,4,3,6};
		System.out.println("Enter the elements");
		for (i = 0; i < n; i++) {
			System.out.print("a[" + i + "]=");

			a[i] = sc.nextInt();
		}
		n = a.length;
		/*...In this program sorting is compulsory Without Sort Program not go to Succesful*/
		for (i = 0; i < n - 1; i++) {

			for (int j1 = 0; j1 < n - i - 1; j1++)

			{
				if (a[j1] > a[j1 + 1]) {
					temp = a[j1];
					a[j1] = a[j1 + 1];
					a[j1 + 1] = temp;
				}

			}
		}
		/* ...................Logic....................... */
		for (i = 0; i < n; i++) {
			if (m != a[i]) {
				count = 0;
				for (j = 0; j < n; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				System.out.println(/* b[i]+"=" */+a[i] + "=" + count);
			}

			m = a[i];
		}

	}

}
