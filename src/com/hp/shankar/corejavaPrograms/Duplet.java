package com.hp.shankar.corejavaPrograms;

/*Duplet i/p--> 1 2 3 4 5  o/pEnter the Input 6
 * duplet number are= 1+5=6,2+4=6*/
import java.util.Scanner;

public class Duplet {

	public static void main(String[] args) {
		int row, i, column, input, sum = 0, n1;
		int a[] = new int[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		input = sc.nextInt();
		for (i = 0; i < input; i++)
		{
			System.out.print("a[" + i + "]=");
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the Input");
		n1 = sc.nextInt();
		for (row = 0; row < input; row++)
		{

			for (column = row + 1; column < input; column++)

			{

//				System.out.println(sum+"="+a[row]+"+"+a[column]);
				sum = a[row] + a[column];

				if (n1 == sum)

				{
					System.out.println("duplet number are= " + a[row] + "+" + a[column] + "=" + sum);
					break;
				}

			}

		}
		//System.out.println("\nSorry No Duplets Are Create ");

	}

}
