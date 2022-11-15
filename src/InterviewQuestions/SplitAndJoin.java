package InterviewQuestions;

public class SplitAndJoin {

	public static void main(String[] args) {
		String string = "My Name Is Shankarrao Birajdar";

		SplitAndJoinMethod(string);
	}

	public static void SplitAndJoinMethod(String str) {

		String[] splitArr = str.split(" ");
		System.out.println("Split by Space");
		for (String string : splitArr) {
			System.out.println(string);
		}

		String joinString = String.join(" ", splitArr);
		System.out.println("Joined String=> "+joinString);
	}

}
