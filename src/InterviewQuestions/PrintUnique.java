package InterviewQuestions;

public class PrintUnique {

	public static void main(String[] args) {
		int[] arr = { 6, 2, 5, 7, 2, 5, 2, 7 };
//		String str="Shankarrao";
//		char[] arr = str.toCharArray();
		PrintUniqueMethod(arr);

	}

	public static void PrintUniqueMethod(int[] arr) {
		
		int length = arr.length;
		int replace = 999;
		
		for(int i=0;i<length;i++) {
			int count=1;
			for(int j=i+1;j<length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]=replace;
				}
			}
			
			if(count>=1 && arr[i]!=replace) {
				System.out.println(arr[i] + "=" + count);
			}
		}

	}

	public static void PrintUniqueMethod(char[] arr) {

		int length = arr.length;

		
		for(int i=0;i<length;i++) {
			int count=1;
			for(int j=i+1;j<length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr[j]='#';
				}
			}
			
			if(count>=1 && arr[i]!='#') {
				System.out.println(arr[i] + "=" + count);
			}
		}
		
	}

}
