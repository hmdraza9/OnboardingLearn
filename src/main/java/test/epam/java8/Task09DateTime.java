package test.epam.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.function.Supplier;

public class Task09DateTime {

	public static void mainTask09DateTime() {

		isYesterday("2024-01-17");
		nextTHUSupplier();
		curTimeSupplier();
		ageCalculator("1950-01-23");

	}

	private static boolean isYesterday(String date) {

		LocalDate dateGiven = LocalDate.parse(date);
		LocalDate yesterdayDate = LocalDate.now().minusDays(1);

		System.out.println(dateGiven.equals(yesterdayDate));
		System.out.println(dateGiven.equals(dateGiven));

		return dateGiven.equals(yesterdayDate);

	}

	private static void ageCalculator(String date) {

		LocalDate dob = LocalDate.parse(date);
		LocalDate now = LocalDate.now();
		System.out.println("Age in year: " + Period.between(dob, now).getYears() + " years");

	}

	public static LocalDate nextTHUSupplier() {
		return new NextThursdaySupplier().get();
	}

	public static LocalDateTime curTimeSupplier() {
		return new CurrentTimeSupplier().get();
	}

}

class NextThursdaySupplier implements Supplier<LocalDate> {
	@Override
	public LocalDate get() {
		LocalDate today = LocalDate.now();
		int daysUntilNextThursday = (DayOfWeek.THURSDAY.getValue() - today.getDayOfWeek().getValue() + 7) % 7;
		return today.plusDays(daysUntilNextThursday);
	}
}

class CurrentTimeSupplier implements Supplier<LocalDateTime> {
	@Override
	public LocalDateTime get() {
		return LocalDateTime.now(ZoneId.of("America/New_York"));
	}
}
