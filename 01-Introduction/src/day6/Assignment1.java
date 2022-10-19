package day6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Assignment1 {
	public static void main(String[] args) {
		holidayStatus();
	}

	private static void holidayStatus() {

		// local date
		LocalDate localDate = LocalDate.now();

		String[] weekenDays = { "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" };
		String weekenDaysStr = Arrays.deepToString(weekenDays); // change to str
		String currentDay = localDate.getDayOfWeek().toString();

		// sample output text
		String noTimeText = "I've no time. I'm studying Java Programming Language.";
		String holidayText = "Today is my holiday!. So, time to play video games!";

		// custom format
		DateTimeFormatter localDateFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

		// output
		System.out.println("-------- Assignmetn 1 by Bo Bo Aung ---------\n");
		System.out.println(localDate.format(localDateFormat));
		System.out.println("*****************************");

		// condition with contains method
		if (weekenDaysStr.contains(currentDay)) {
			System.out.println(noTimeText);
		} else {
			System.out.println(holidayText);
		}
	}
}
