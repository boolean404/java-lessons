package day4;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		sleepTimeCheck();
	}

	public static void sleepTimeCheck() {
		boolean status = true;
		Scanner sc = new Scanner(System.in);

		while (status) {
			// inp1
			System.out.print("When do you go bed? : ");
			String inp1 = sc.nextLine();

			// inp1 condition
			if (!inp1.equals("exit")) {
				System.out.print("When do you get up? : ");
				String inp2 = sc.nextLine();

				// inp2 condition
				if (!inp2.equals("exit")) {

					// string to integer
					int goBedTime = Integer.parseInt(inp1);
					int getUpTime = Integer.parseInt(inp2);

					// sleep time hours
					int sleepTimeHours = 0;

					// change interval sleep time
					if (goBedTime <= 12 && goBedTime >= 6) {
						sleepTimeHours = getUpTime + (12 - goBedTime);
					} else {
						sleepTimeHours = getUpTime - goBedTime;
					}

					// sleep hours output
					System.out.println("You sleep " + sleepTimeHours + " hours.");

					// condition for output moti msg
					if (sleepTimeHours >= 5 && sleepTimeHours <= 8) {
						System.out.println("You take care your health well!");
					} else if (sleepTimeHours < 5) {
						System.out.println("You are very hardworking!");
					} else if (sleepTimeHours > 8) {
						System.out.println("You are abnormal!");
					}
					System.out.println("--------- Program is ongoing if you wanna terminate type 'exit' ----------\n");

				} else {
					status = false;
					System.out.println("Program terminated by user..........");
				}

			} else {
				status = false;
				System.out.println("Program terminated by user..........");
			}
		}
	}
}
