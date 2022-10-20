package day6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		foodMonkey();
	}

	public static void foodMonkey() {
		boolean orderAgain = true;

		Scanner sc = new Scanner(System.in);

		// data for this project
		String[] menus = { "Pizza", "Burger", "Milk Tea", "Spicy Noodle" };
		String[] quarters = { "Kyauk Maw", "Kyauk Yat", "Wa Maw", "Shwe Taung" };
		int[] times = { 15, 30, 10, 45 };

		String selectedItemName;
		String selectedQtName;
		int selectedDur;

		while (orderAgain) {

			// start menu section
			System.out.println("-------- Assignmetn 2 by Bo Bo Aung ---------\n");
			System.out.println("\n------- Welcome to Food Monkey --------");
			System.out.println("********* Available Menus ********");

			for (int i = 0; i < menus.length; i++) {
				System.out.println((i + 1) + ". " + menus[i]);
			}
			System.out.print("\nPlease choose item number : ");

			// input validation
			ReuseableMethods.userInputValidation(sc, menus.length);

			int inpItemNum = sc.nextInt();
			selectedItemName = menus[inpItemNum - 1];
			System.out.println("=> " + selectedItemName + " is selected.");
			// end menu section

			// start deliverable quarter section
			System.out.println("\n********* Deliverable Township ***********");
			System.out.println("We'are only delivering the follwing Quarters in Dawei.");

			for (int i = 0; i < quarters.length; i++) {
				System.out.println((i + 1) + ". " + quarters[i] + " (" + times[i] + " mins)");
			}

			System.out.print("\nPlease choose quarter : ");

			// input validation
			ReuseableMethods.userInputValidation(sc, quarters.length);

			int inpQtNum = sc.nextInt();
			selectedQtName = quarters[inpQtNum - 1];
			selectedDur = times[inpQtNum - 1];
			System.out.println("=> " + selectedQtName + " is selected.");
			// end deliverable quarter section

			// start order type section
			System.out.println("\n********* Order Type ***********");
			System.out.println("1. Order Now?");
			System.out.println("2. Preorder?");
			System.out.print("\nPlease choose 1 or 2 : ");

			// input validation
			ReuseableMethods.userInputValidation(sc, 2);
			int inpOrderType = sc.nextInt();

			// start order information section
			int inpDeliDay = 0;
			if (inpOrderType == 2) {
				System.out.print("Enter deliver date (dd) under 8 days : ");

				// input validation
				ReuseableMethods.userInputValidation(sc, 7);
				inpDeliDay = sc.nextInt();
			}

			DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm:ss a");
			DateTimeFormatter f2 = DateTimeFormatter.ofPattern("EEEE, MMM dd yyyy");
			LocalTime timeNow = LocalTime.now();
			LocalDate dateNow = LocalDate.now();
			;
			selectedQtName = quarters[inpQtNum - 1];

			System.out.println("\n********* Your Order Information ***********");
			System.out.println("Item Name : " + selectedItemName);
			System.out.println("Your Address : " + selectedQtName);
			System.out.println("Order Time : " + timeNow.format(f1));

			if (inpOrderType == 1) {
				System.out.println("Duration : " + selectedDur + " mins");
				System.out.println("Arrival Time : " + timeNow.plusMinutes(selectedDur).format(f1));
			} else {
				System.out.println("Arrival Date : " + dateNow.plusDays(inpDeliDay).format(f2));
			}
			System.out.println("********* Thank you for your ordering ***********");
			// end order type section

			// order again ask
			System.out.print("\nIf you want to order again, press 'yes' or 'no' for Exit.... : ");

			// order again validation
			ReuseableMethods.orderAgainValidation(sc);
			String yesOrNo = sc.next().toLowerCase();

			if (yesOrNo.equals("no")) {
				orderAgain = false;
				System.out.println(".....................Thanks for shopping with us..................");
			}
		}

	}
}

class ReuseableMethods {
	public static void userInputValidation(Scanner sc, int lastNum) {
		while (sc.hasNext("[a-zA-Z]+")) {
			System.out.println("Don't input letters!");
			System.out.print("Please input item Number Only : ");
			sc.next();
		}
		while (!sc.hasNext("[1-" + lastNum + "]")) {
			System.out.print("Please input available number : ");
			sc.next();
		}
	}

	public static void orderAgainValidation(Scanner sc) {
		while (sc.hasNextInt() || !sc.hasNext("[yes,no]+")) {
			System.out.print("Type 'yes' or 'no' only : ");
			sc.next();
		}

	}

}
