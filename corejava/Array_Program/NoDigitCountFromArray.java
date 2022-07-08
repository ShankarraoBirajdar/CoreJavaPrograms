package Array_Program;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class NoDigitCountFromArray {

	public static void main(String[] args) throws IOException {
		int i, n, count = 0, j;
		// Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the size of first array");
		// n=sc.nextInt();
		int a[] = { 1, 2, 2, 3, 4, 3, 6 };
		int flag = 0;
		int b[] = new int[a.length];
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		n = a.length;
		// for(i=0;i<n;i++)
		// {
		//
		// if(a[i]==a[j])
		// {
		// b[i]=a[i];
		// }
		// }
		// //System.out.println(b[i]);
		// }

		for (i = 0; i < n; i++) {
			count = 0;
			for (j = 0; j < n; j++) {
				/*
				 * if(i>0) { for(int k=0;k<b.length-1;k++) {
				 * System.out.println(b[k]); if(b[k]==a[i]) { flag=1; break; } }
				 * } if(flag==1) { break; }
				 * 
				 * else
				 */ if (a[i] == a[j]) {

					count++;
				}
			}

			hm.put(a[i], count);
			// System.out.println(i+"-->"+a[i]+"="+count);
		}
		for (Map.Entry e : hm.entrySet()) {
			System.out.println("" + e.getKey() + "=" + e.getValue());
		}

	}
}
