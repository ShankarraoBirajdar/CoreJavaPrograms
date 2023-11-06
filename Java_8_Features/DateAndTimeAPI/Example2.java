package DateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class Example2 {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();
		
		//to get day month and year
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		
		System.out.println(day+" "+month+" "+year);
		String dateString=String.format("%d-%d-%d", day,month,year);
		System.out.println(dateString);
		System.out.printf("%d-%d-%d", day,month,year);
		
		// to get hour minute second and nanosecond
		LocalTime time = LocalTime.now();
		int hour = time.getHour();
		int minute = time.getMinute();
		int second  = time.getSecond();
		int nanoSecond = time.getNano();
		System.out.printf("\n%d:%d:%d:%d", hour,minute,second,nanoSecond);

	}

}
