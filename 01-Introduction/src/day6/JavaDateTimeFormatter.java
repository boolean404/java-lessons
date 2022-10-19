package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeFormatter {
	public static void main(String[] args) {
		DateTimeFormatter dateFormat = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter timeFormat = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println("ISO_LOCAL_DATE Format : " + date.format(dateFormat));
		System.out.println("ISO_LOCAL_TIME Format : " + time.format(timeFormat));
		System.out.println("ISO_LOCAL_DATE_TIME Format : " + dateTime.format(dateTimeFormat));
		
	}
}
