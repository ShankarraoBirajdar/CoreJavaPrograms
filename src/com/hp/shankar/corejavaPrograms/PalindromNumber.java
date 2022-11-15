package com.hp.shankar.corejavaPrograms;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int number = sc.nextInt();
		boolean isPalindrom= isPalindrom(number);
		if (isPalindrom) {
			System.out.println(isPalindrom+ " Number is Palindrom");
		} else {
			System.out.println(isPalindrom+ " Number is Not a Palindrom");
		}

	}
	
	public static boolean isPalindrom(int number) {
		boolean isPalindrom=false;
		int sum = 0,rem, temp,sum2=0;
		temp=number;
		
		while(number>0){
			rem=number%10;
		
			sum=(sum2*10)+rem;
			sum2=sum;
			number=number/10;
//			System.out.println(temp+" "+number);
		}
		System.out.println(temp+" "+number);
		if (temp==number) {
			isPalindrom=true;
		}
		
		return isPalindrom;
		
	}

}
