package StarPattern;

public class star1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");//space

			}

			for (int j = i; j <= 5; j++) {
				System.out.print("*");//star

			}
			System.out.println();//lines
		}

	}

}
