package com.hp.shankar.ArraysClass;

public class App {

	public static void main(String[] args) {

		int row = 3;
		int column = 3;
		int[][] a = new int [row][column];
		int[][] b = new int [row][column];
		int[][] c = new int [row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a[i][j]=i;
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				b[i][j]=i;
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
