package DateAndTimeAPI;

import java.time.LocalDateTime;

public class Example4 {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(1993,02,07,6,15);
		System.out.println(dateTime);
		
		System.out.println("After Six month: "+dateTime.plusMonths(6));
		System.out.println("Before Six month: "+dateTime.minusMonths(6));

	}

}
