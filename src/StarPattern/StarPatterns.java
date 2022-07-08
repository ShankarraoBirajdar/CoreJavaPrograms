package StarPattern;

import java.util.*;

public class StarPatterns {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Please Select The Patterns");
		System.out.println("1. Triangle");
		System.out.println("2. Decreasing Triangle");
		System.out.println("3. Right Sided Triangle");
		System.out.println("4. Priyamid");
		System.out.println("5. Reverse Priyamid");
		System.out.println("6. Diamond");
		int select = sc.nextInt();

		switch (select) {
		case 1:
			printTriangle();
			break;
		case 2:
			printDecreasingTriangle();
			break;
		case 3:
			printRightSidedTriangle();
			break;
		case 4:
			printPriyamid();
			break;
		case 5:
			printReversePriyamid();
			break;
		case 6:
			printDiamond();
			break;
		default:
			System.out.println("Parameter is unknown");
			break;
		}

	}
	
	public static void printTriangle() {
		System.out.println("Please Enter The Pattern");
		String pattern = sc.next();
		System.out.println("Please Enter The input");
		int input = sc.nextInt();
		for (int row = 0; row < input; row++) {
			for (int column = 0; column < row; column++) {//Increasing pattern
				System.out.print(pattern + " ");
			}
			System.out.println();
		}

	}
	public static void printDecreasingTriangle() {
		System.out.println("Please Enter The Pattern");
		String pattern = sc.next();
		System.out.println("Please Enter The input");
		int input = sc.nextInt();
		for (int row = 0; row < input; row++) {
			for (int column = row; column < input; column++) {//decreasing pattern
				System.out.print(pattern + " ");
			}
			System.out.println();
		}

	}
	public static void printRightSidedTriangle() {
		System.out.println("Please Enter The Pattern");
		String pattern = sc.next();
		System.out.println("Please Enter The input");
		int input = sc.nextInt();
		for (int row = 0; row < input; row++) {
			for (int column = row; column < input; column++) {
				System.out.print("  ");// 2 space //decreasing Space 
			}
			for (int column = 0; column < row; column++) {
				System.out.print(pattern + " ");//Increasing pattern
			}
			System.out.println();
		}
	}
	public static void printPriyamid() {
		System.out.println("Please Enter The Pattern");
		String pattern = sc.next();
		System.out.println("Please Enter The input");
		int input = sc.nextInt();
		for (int row = 0; row < input; row++) {
			for (int column = row; column < input; column++) {
				System.out.print("  ");// 2 space
			}
			for (int column = 0; column < row-1; column++) {
				System.out.print(pattern + " ");// after pattern one space
			}
			for (int column = 0; column < row; column++) {
				System.out.print(pattern + " ");// after pattern one space
			}
			System.out.println();
		}
	}
	public static void printReversePriyamid() {
		System.out.println("Please Enter The Pattern");
		String pattern = sc.next();
		System.out.println("Please Enter The input");
		int input = sc.nextInt();
		
		for (int row = 0; row < input; row++) {
			for (int column = 0; column < row; column++) {
				System.out.print("  ");// 2 space
			}
			for (int column = row; column < input-1; column++) {
				System.out.print(pattern + " ");// after pattern one space
			}
			for (int column = row; column < input; column++) {
				System.out.print(pattern + " ");// after pattern one space
			}
			System.out.println();
		}
	}
	public static void printDiamond() {
		System.out.println("Please Enter The Pattern");
		String pattern = sc.next();
		System.out.println("Please Enter The input");
		int input = sc.nextInt();
		for (int row = 0; row < input; row++) {
			for (int column = row; column < input; column++) {
				System.out.print("  ");// 2 space
			}
			for (int column = 0; column < row-1; column++) {
				System.out.print(pattern + " ");// after pattern one space
			}
			for (int column = 0; column < row; column++) {
				System.out.print(pattern + " ");// after pattern one space
			}
			System.out.println();
		}
		
		for (int row = 0; row < input; row++) {
			for (int column = 0; column < row; column++) {
				System.out.print("  ");// 2 space
			}
			for (int column = row; column < input-1; column++) {
				System.out.print(pattern + " ");// after pattern one space
			}
			for (int column = row; column < input; column++) {
				System.out.print(pattern + " ");// after pattern one space
			}
			System.out.println();
		}
		
	}

}
