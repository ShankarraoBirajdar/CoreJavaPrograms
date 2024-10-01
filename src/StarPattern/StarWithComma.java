package StarPattern;

public class StarWithComma {

	public static void main(String[] args) {
//		for (int i = 1; i < 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				if (i > 1 && j < i)
//					System.out.print(j + ","); // 2,3
//				else
//					System.out.print(j); // 1
//			}
//			System.out.println();
//		}
		triangle();
	}
	
	
	public static void triangle() {
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <=i; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 5; j >=i; j--) {
				System.out.print("*");
			}
			for (int j = 4; j >=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
