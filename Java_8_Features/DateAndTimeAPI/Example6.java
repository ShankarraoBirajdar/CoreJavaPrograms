package DateAndTimeAPI;

import java.time.Year;
import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		
		getLeapYear();
	}
	
	private static void getLeapYear() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Year");
		int year = scanner.nextInt();
		Year objYear = Year.of(year);
		if (objYear.isLeap()) {
			System.out.printf("%d year is leap year",year);
		}else {
			System.out.printf("%d year is not leap year",year);
		}
	}

}
