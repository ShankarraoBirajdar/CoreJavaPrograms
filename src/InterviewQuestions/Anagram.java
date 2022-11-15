package InterviewQuestions;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "listen";
		String str2 = "silent";

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int count = 0;
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				for (int j = 0; j < arr2.length; j++) {
					if (arr1[i] != arr2[j]) {
						count++;
					}
				}
			}

			if (count > 0) {
				System.out.println("its Anagram");
			} else {
				System.out.println("its not a Anagram");
			}
			
			  // if(Arrays.equals(arr1,arr2)){
	        //     System.out.println("its Anagram");
	        // }
	        // else{
	        //     System.out.println("its not a Anagram");
	        // }
	        }

		}
	

}
