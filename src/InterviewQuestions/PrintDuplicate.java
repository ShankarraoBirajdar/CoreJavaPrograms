package InterviewQuestions;

import java.util.Arrays;

public class PrintDuplicate {

	public static void main(String[] args) {
//		int[] arr = { 6, 2, 5, 7, 2, 5, 2, 7 };
		String str="Shankarrao";
		char[] arr = str.toCharArray();
		PrintDuplicateMethod(arr);

	}

	public static void PrintDuplicateMethod(int[] arr) {

		Arrays.sort(arr);
		int length = arr.length;

		for (int i = 0; i < length - 1; i++) {

			int count = 1;
			for (int j = i + 1; j < length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				} else {
					break;
				}
			}

			if (count > 1) {
				System.out.println(arr[i] + "=" + count);
				i = i + (count - 1);
			}
		}

	}

	public static void PrintDuplicateMethod(char[] arr) {
		
//		[S, a, a, a, h, k, n, o, r, r]
		
//		for(int i=0;i<arr.length-1;i++) {
//			arr[i]=Character.toLowerCase(arr[i]);
//		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int length = arr.length;

		for (int i = 0; i < length - 1; i++) {

			int count = 1;
			for (int j = i + 1; j < length; j++) {

				if (arr[i] == arr[j]) {
					count++;
				} else {
					break;
				}
			}

			if (count > 1) {
				System.out.println(arr[i] + "=" + count);
				i = i + (count - 1);
			}
		}
	}

}
