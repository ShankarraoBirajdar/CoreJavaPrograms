package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class Example5 {
	public static void main(String[] args) {
		ageCalculator();
	}
	
	public static void ageCalculator() {
		int day = 17;
		int month = 05;
		int year = 1994;
		LocalDate birthday = LocalDate.of(year, month, day);
		LocalDate today= LocalDate.now();
		Period period  =Period.between(birthday, today);

		System.out.printf("Your Age is %d years %d months %d days", period.getYears(),period.getMonths(),period.getDays());

	}
}
