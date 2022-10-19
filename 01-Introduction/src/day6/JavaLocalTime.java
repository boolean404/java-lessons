package day6;

import java.time.LocalTime;

public class JavaLocalTime {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
		LocalTime time1 = LocalTime.of(11, 03, 45);
		LocalTime time2 = LocalTime.parse("04:30");

		System.out.println("Current time: " + now);
		System.out.println("Previous hour : " + now.minusHours(1).getHour());
		System.out.println("Curent hour : " + now.getHour());
		System.out.println("Current minute : " + now.getMinute());
		System.out.println(time1);
		System.out.println(time2);
	}
}
