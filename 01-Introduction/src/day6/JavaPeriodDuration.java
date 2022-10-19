package day6;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class JavaPeriodDuration {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.parse("2000-02-20");
		LocalDate endDate = LocalDate.parse("2020-09-21");

		int months = Period.between(startDate, endDate).getMonths();
		int days = Period.between(startDate, endDate).getDays();

		System.out.println("No. of months : " + months);
		System.out.println("No. of days : " + days);

		LocalTime startTime = LocalTime.parse("11:30");
		LocalTime endTime = LocalTime.parse("12:30");

		long seconds = Duration.between(startTime, endTime).getSeconds();
		System.out.println("No. of seconds " + seconds);
	}
}
