package DateAndTimeAPI;

import java.time.LocalDateTime;

public class Example3 {

	public static void main(String[] args) {

		// to get current system date and time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		// to get day month and year
		int day = dateTime.getDayOfMonth();
		int month = dateTime.getMonthValue();
		int year = dateTime.getYear();

		String dateString = String.format("%d-%d-%d", day, month, year);
		System.out.println(dateString);
		
		// to get hour minute second and nanosecond
		int hour = dateTime.getHour();
		int minute = dateTime.getMinute();
		int second  = dateTime.getSecond();
		int nanoSecond = dateTime.getNano();
		System.out.printf("%d:%d:%d:%d", hour,minute,second,nanoSecond);

	}

}
