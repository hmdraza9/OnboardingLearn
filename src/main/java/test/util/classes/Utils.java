package test.util.classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

	public static String getTime() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d-MMM-yyyy_HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);

	}

}
