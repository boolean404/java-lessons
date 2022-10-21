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

		String[] questionWords = { "Do", "Does", "Are", "Can", "Will", "May", "Shall", "Must", "Have", "Has", "How",
				"What", "When", "Where", "Is", "Which" };
		boolean isQueation = true;

		System.out.println("\n----------- Output ----------");
		for (String qWord : questionWords) {
			if (userInputSentence.contains(qWord) && userInputSentence.endsWith("?")) {
				System.out.println("Your input sentence is : " + userInputSentence);
				System.out.println("The first word of your input is : " + strArr[0]);
				System.out.println("Your input sentence is a simple present question.");
				isQueation = true;
				break;
			} else {
				isQueation = false;
			}
		}
		if (!isQueation) {
			System.out.println("Your input sentence is : " + userInputSentence);
		}
		System.out.println("----------- Bye ----------");

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