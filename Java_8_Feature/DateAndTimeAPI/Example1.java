package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example1 {

	//https://www.joda.org/joda-time/
	//Joda-Time provides a quality replacement for the Java date and time classes.
	public static void main(String[] args) {
		// to get current system date
		LocalDate date = LocalDate.now();
		System.out.println(date);

		// to get current system time
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}

}
