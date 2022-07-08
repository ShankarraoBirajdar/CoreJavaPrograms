package com.hp.shankar.StringOperations;

import java.util.Scanner;


public class VowelReverse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

//		String str = "aeiouAEIOU";
//		String str = "hello";
//		String str="leetcode";
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter Vowel String to get Reverse Vowel in the String");
		String str = scanner.nextLine();
		String getVowelReverse = getVowelReverse(str);
		System.out.println(getVowelReverse);
	}

	private static String getVowelReverse(String str) {
		char[] charArray = str.toCharArray();
		int left = 0;
		int right = charArray.length - 1;
		while (left < right) {
			while (left < right && isVowel(charArray, left) == false) {
				left++;
			}
			while (left < right && isVowel(charArray, right) == false) {
				right--;
			}
			swap(charArray, left, right);
			left++;
			right--;
		}
		String reverseVowelString = "";
		for (char ch : charArray) {
			reverseVowelString += ch;
		}
		return reverseVowelString;

	}

	private static void swap(char[] charArray, int left, int right) {
		char temp = charArray[left];
		charArray[left] = charArray[right];
		charArray[right] = temp;
	}

	private static boolean isVowel(char[] charArray, int index) {
		char ch = charArray[index];
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}
		return false;
	}

}
