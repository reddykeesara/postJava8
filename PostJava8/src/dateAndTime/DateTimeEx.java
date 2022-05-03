package dateAndTime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeEx {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate yestday = today.minusDays(1);
		System.out.println(yestday.toString());
		
		String yestdayStr = (today.minusDays(1)).format(DateTimeFormatter.ISO_DATE);
		System.out.println(yestdayStr);
		
		Date yday = new Date(System.currentTimeMillis() - 1000L * 60L * 60L * 24l);
		System.out.println(yday);
		
		String sdf = new SimpleDateFormat("yyyy-MM-dd").format(yday);
		System.out.println(sdf);
	}
}
