package InterviewQuestions;

import java.util.Iterator;
import java.util.stream.Stream;

public class PrimeNumber {

	public static void main(String[] args) {

//		for (int i = 0; i < 100; i++) {
//			if (isPrimeNumber(i)) {
//				System.out.println(i+" is prime no");
//			}else if(i > 1){
//				System.out.println(i+" is composite no");
//			}
//		}
		
//		int no=3;
//		Stream.iterate(2, x->x<no, x->x+1)
//		.filter(PrimeNumber::isPrimeNumber).forEach(x->System.out.println(x+" is prime no"));
		
//		.peek(x->System.out.println((no +" "+x)))
		
//		peek(s->System.out.println(s)).
//		Stream.of(5).filter(x->x%2==0)

		System.out.println(isPrimeNumber(97));
	}
	
//	2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97
	
	public static boolean isPrimeNumber(int no) {
		boolean isPrimeNumber = true;

		// Corner case
		if (no <= 1)
			isPrimeNumber = false;

		
		for (int i = 2; i < Math.sqrt(no); i++) {
			System.out.println(i+" "+Math.sqrt(no));
//			System.out.println(no + "%" + i + "=" + (no % i));
			if (no % i == 0) {
				isPrimeNumber = false;
			}
		}
		
		
		// Check from 2 to n-1
//		for (int i = 2; i < no; i++) {
//			System.out.println(i+" "+no);
//			System.out.println(no + "%" + i + "=" + (no % i));
//			if (no % i == 0) {
//				isPrimeNumber = false;
//			}
//		}
		return isPrimeNumber;
	}

}
