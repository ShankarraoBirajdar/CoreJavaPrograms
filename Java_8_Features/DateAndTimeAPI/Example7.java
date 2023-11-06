package DateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Example7 {
	public static void main(String[] args) {
		ZoneId zone = ZoneId.systemDefault();
		ZonedDateTime dateTime = ZonedDateTime.now();
		System.out.println(zone);// Asia/Calcutta
		System.out.println(dateTime);

		// ZoneId for IND
		ZoneId zoneIND = ZoneId.of(ZoneId.SHORT_IDS.get("IST"));
		ZonedDateTime dateTimeIND = ZonedDateTime.now(zoneIND);
		System.out.println(dateTimeIND);
		// ZoneId for US
		ZoneId zoneUS = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dateTimeUS = ZonedDateTime.now(zoneUS);
		System.out.println(dateTimeUS);
		// ZoneId for EU
		ZoneId zoneEU = ZoneId.of("Europe/Paris");
		ZonedDateTime dateTimeEU = ZonedDateTime.now(zoneEU);
		System.out.println(dateTimeEU);
		// ZoneId for UK
		ZoneId zoneUK = ZoneId.of("+01:00");
		ZonedDateTime dateTimeUK = ZonedDateTime.now(zoneUK);
		System.out.println(dateTimeUK);
	}
}
