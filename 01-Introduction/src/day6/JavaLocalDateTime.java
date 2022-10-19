package day6;

import java.time.LocalDateTime;
import java.time.Month;

public class JavaLocalDateTime {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime dateTime = LocalDateTime.of(2000, Month.OCTOBER, 22, 04, 20);
		
		System.out.println("Current date time : " + now);
		System.out.println("Current Year : " + now.getYear());
		System.out.println("Current Month :" + now.getMonth());
		System.out.println("Current day : " + now.getDayOfMonth());
		System.out.println("Current hour : " + now.getHour());
		System.out.println("Current minute : " + now.getMinute());
		System.out.println("Current second : " + now.getSecond());
		
	}
}
