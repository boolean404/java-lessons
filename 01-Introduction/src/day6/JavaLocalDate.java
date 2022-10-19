package day6;

import java.time.LocalDate;

public class JavaLocalDate {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate locdate1 = LocalDate.of(2000, 2, 1);
//		LocalDate locdate2 = LocalDate.parse("2000/2/1");

		// now
		System.out.println("Current date: " + now);
		System.out.println("Yester date: " + now.minusDays(1));
		System.out.println("Tomorrow date: " + now.plusDays(1));

		System.out.println("Current Year: " + now.getYear());
		System.out.println("Current Month: " + now.getMonth());
		System.out.println("Current day of week: " + now.getDayOfWeek());
		System.out.println("Current day of month: " + now.getDayOfMonth());
		System.out.println(now + " is leap year: " + now.isLeapYear());
		System.out.println(locdate1 + " is leap year: " + locdate1.isLeapYear());
//		System.out.println(locdate1 + " is same to " + locdate2 +" : " +locdate1.equals(locdate2));

//		System.out.println(now);
//		System.out.println(locdate1);
//		System.out.println(locdate2);
	}
}
