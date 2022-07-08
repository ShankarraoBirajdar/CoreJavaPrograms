package com.hp.shankar.corejavaPrograms;

import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number:");
		int number = sc.nextInt();
		reverseNumber(number);
	}

	public static void reverseNumber(int number) {
		int mod=0,reverse=0,reverse1=0,no=0;
		no=number;
		
		while(no>0) {
			
			mod=no%10;
			System.out.println(mod+"="+no+"%10");
			reverse=reverse1*10+mod;
			System.out.println(reverse+"="+reverse1+"*10+"+mod);
			reverse1=reverse;
			no=no/10;
			System.out.println(no+"="+no+"/10");
			System.out.println();
		}
		
		System.out.println("Reverse no of "+number+" is: "+reverse);
		
	}
}
