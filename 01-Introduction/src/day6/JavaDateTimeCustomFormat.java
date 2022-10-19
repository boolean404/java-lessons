package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeCustomFormat {
	public static void main(String[] args) {

		// custom patterns
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MMM dd yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh-m-s");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("MMMM dd yyyy 'at' h:m:ss");
		
		// local date
		LocalDate now = LocalDate.now();
		System.out.println("Default Format : " + now);
		System.out.println("Custom Format : " + now.format(f1));

		// local time
		LocalTime time = LocalTime.now();
		System.out.println("Default Format : " + time);
		System.out.println("Custom Format : " + time.format(f2));

		// local date time
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Default Format : " + dateTime);
		System.out.println("Custom Format : " + dateTime.format(f3));
		
	}
}
