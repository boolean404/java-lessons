package day7;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		verifyUserInput(sc);
	}

	private static void verifyUserInput(Scanner sc) {
		System.out.println("----------- String Assignment 2 by Bo Bo Aung----------\n");

		// input with validation
		String userInputSentence = ReuseableMethods.userInputValidation(sc);

		String[] strArr = userInputSentence.split(" ");
		if (userInputSentence.endsWith("?")) {
			System.out.println("\nThe first word of user input is : " + strArr[0]);
			String[] questionWords = { "Do", "Does", "Are", "Can", "Will", "May", "Shall", "Must", "Have", "Has" };

			for (String qWord : questionWords) {
				if (userInputSentence.contains(qWord)) {
					System.out.println("Your input sentence is a simple present question.");
				}
			}
		} else {
			System.out.println("\nYour input sentence isn't a question sentence.");
		}
		System.out.println("\n----------- Bye ----------");
	}
}

class ReuseableMethods {
	public static String userInputValidation(Scanner sc) {
		System.out.print("Enter a sentence : ");
		String inpStr = sc.nextLine();

		while (!Character.isUpperCase(inpStr.charAt(0)) || !inpStr.endsWith("?") && !inpStr.endsWith(".")) {
			System.out.print("Please input a complete sentence : ");
			inpStr = sc.nextLine();
		}
		return inpStr;

	}
}