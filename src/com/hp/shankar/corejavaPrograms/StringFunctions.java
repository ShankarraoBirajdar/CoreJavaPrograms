package com.hp.shankar.corejavaPrograms;

import java.util.Arrays;

public class StringFunctions {

	@SuppressWarnings({ "static-access", "null" })
	public static void main(String[] args) {

		String str = "ABCDEFG";
		String str2 = "abcdefg";
		String str3 = "ABCDEFG";
		String str4 = "abcdefg";
		String str5 = "";

		/* Returns the char value at thespecified index */
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length() - 1));

		/*
		 * Returns the number of Unicode code points in the specified textrange of this
		 * String.
		 */
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointCount(0, str.length()));

		/* Compares two strings lexicographically */
		System.out.println(str.compareTo(str2)); // str.charAt(0)-str2.charAt(0)
		System.out.println(str.compareToIgnoreCase(str2));

		/* Concatenates the specified string to the end of this string. */
		System.out.println(str.concat(str2));
		System.out.println(str.concat(str3));

		/*
		 * Returns true if and only if this string contains the specifiedsequence of
		 * char values
		 */
		System.out.println(str.contains("ABC"));
		System.out.println(str.contains("abc"));

		/* Compares this string to the specified CharSequence */
		System.out.println(str.contentEquals(str2));
		System.out.println(str.contentEquals(str3));

		/* Tests if this string ends with the specified suffix. */
		System.out.println(str.endsWith("G"));
		System.out.println(str.endsWith("g"));

		/*
		 * Returns true if the string is empty or contains only white space
		 * codepoints,otherwise false.
		 */
		System.out.println(str5.isBlank());

		/* Returns true if, and only if, length() is 0. */
		System.out.println(str5.isEmpty());

		/* a String that contains the characters of thecharacter array. */
		char[] ch = { 's', 'h', 'a', 'n', 'k', 'a', 'r', 'r', 'a', 'o' };
		System.out.println(str.copyValueOf(ch));
		System.out.println(str.copyValueOf(ch, 0, 7));

		/*
		 * Adjusts the indentation of each line of this string based on the value of n,
		 * and normalizes line termination characters.
		 */
		System.out.println(str.indent(10));

		/*
		 * Returns the index within this string of the first occurrence of the specified
		 * character
		 */
		System.out.println(str.indexOf(65));// pass Character ASCII value as a parameter
		System.out.println(str.indexOf(66));
		System.out.println(str.indexOf(67));
		System.out.println(str.indexOf(68));
		System.out.println(str.indexOf(69));
		/*
		 * Returns the index within this string of the first occurrence of the specified
		 * character
		 */
		System.out.println(str.indexOf("A"));
		System.out.println(str.indexOf("B"));
		System.out.println(str.indexOf("C"));
		System.out.println(str.indexOf("D"));
		System.out.println(str.indexOf("Z"));// if not found return -1
		System.out.println(str.indexOf(65, 0));
		System.out.println(str.indexOf("A", 0));

		/*
		 * Returns a string whose value is this string, with incidental white space
		 * removed fromthe beginning and end of every line.
		 */
		String str7 = "ABCD\s12345\s!@##$";
		System.out.println(str7.strip());
		System.out.println(str7.stripIndent());
		System.out.println(str7.stripLeading());
		System.out.println(str7.stripTrailing());

		/* Returns a character sequence that is a subsequence of this sequence. */
		System.out.println(str.subSequence(0, 3));
		System.out.println(str.substring(0, 3));
		System.out.println(str.substring(3));

		/*
		 * Returns a string whose value is the concatenation of thisstring repeated
		 * count times
		 */
		System.out.println(str.repeat(5));

		/*
		 * Returns a string resulting from replacing all occurrences of oldChar in this
		 * string with newChar
		 */
		String str8 = "Shankarrao";
		System.out.println(str8.replace('r', 'R'));
		System.out.println(str8.replaceAll("Shankar", "Yashwant"));
		System.out.println(str8.replaceFirst("Shankar", "Yashwant"));
		System.out.println(str8.replace("a", "b"));

		/**/
		String[] arr = { "my", "name", "is", "shankar" };
		System.out.println(String.join("-", arr));

		/**/
		String vowel = "aeiou";
		System.out.println(reverse(vowel));

		System.out.println();
		/**/

		/**/

	}
	
	  static String reverse(String reverse) {
		char[] charArray = new char[reverse.length()];
		for (int i = reverse.length() - 1,j=0; i >= 0; i--,j++) {
				charArray[j] =reverse.charAt(i); 
		}
		return String.valueOf(charArray);
	}

}
