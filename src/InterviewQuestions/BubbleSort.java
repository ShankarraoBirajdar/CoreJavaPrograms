package InterviewQuestions;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

     int[] arr= {10,4,7,2,8,5};
     BubbleSortMethod(arr);

	}
	public static void BubbleSortMethod(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
