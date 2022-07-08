package com.hp.shankar.corejavaPrograms;

import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args)
	{
		int n,r1=0,c1=0,r2=0,c2=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row of first array");
		r1=sc.nextInt();
		System.out.println("Enter the Column of first array");
		c1=sc.nextInt();
		int a[][]=new int[r1][c1];
		System.out.println("Enter the Row of second array");
		r2=sc.nextInt();
		System.out.println("Enter the Column of second array");
		c2=sc.nextInt();
		int b[][]=new int[r2][c2];
		System.out.println("Enter the elements of first Array");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
		    System.out.print("a["+i+"]["+j+"]=");
		    a[i][j]=sc.nextInt();
			}
		
		}
		
		
		System.out.println("Enter the elements of Second Array");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
		    System.out.print("b["+i+"]["+j+"]=");
		    b[i][j]=sc.nextInt();
			}
			
		}

		System.out.println("\n1.Addition.\n2.Substraction.\n3.Multiplication.\n4.Division.");
		int x=sc.nextInt();
		switch(x)
		{
		case 1:
		
		if(r1!=r2||c1!=c2)
		{
		System.out.println("Matrix Addition is Not Possible");	
		}
		else
		{
					System.out.println("Addition Of Matrix is::");
			int  c[][]=new int[r1+r2][c1+c2];
			
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
			    c[i][j]=a[i][j] + b[i][j];
				}
			}
			System.out.println(r1+""+r2+""+c1+""+c2);
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
			    System.out.print(" c["+i+"]["+j+"]="+ c[i][j]);
				}
				System.out.println();
			}
		}break;
		case 2:			System.out.println("Substracion Of Matrix is::");
		int cc[][]=new int[r1+r2][c1+c2];
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
		    cc[i][j]=a[i][j] - b[i][j];
			}
		}
		
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
		    System.out.print(" c["+i+"]["+j+"]="+ cc[i][j]);
			}
			System.out.println();
		}
			break;
		case 3:break;
		case 4:break;
			default:
				
		}
	

	}

}
