package day7;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		System.out.println("----------- String Assignment 3 by Bo Bo Aung ----------\n");
		getUserNRC();
	}

	private static void getUserNRC() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input your NRC information : ");

		// input with validate
		String userNRC = userInputValidate(sc);

		// indexes
		int townIndex1 = userNRC.indexOf("/");
		int townIndex2 = userNRC.indexOf("(");
		int nrcNoIndex1 = userNRC.indexOf(")");
		int nrcNoIndex2 = userNRC.length();
		sc.close();

		// output
		String township = userNRC.substring(townIndex1 + 1, townIndex2);
		String nrcNo = userNRC.substring(nrcNoIndex1 + 1, nrcNoIndex2);
		System.out.println("\n----------- Output ----------");
		System.out.println("Your Township is : " + township.toUpperCase());
		System.out.println("Your NRC No. is : " + nrcNo);
		System.out.println("----------- Bye ----------");
	}

	private static String userInputValidate(Scanner sc) {
		String userData = sc.nextLine();

		try {
			while (userData.length() < 17 || userData.length() > 22) {
				System.out.print("Input NRC information correctly! : ");
				userData = sc.nextLine();

				while (!userData.contains("/")) {
					System.out.print("Missing '/', try again! : ");
					userData = sc.nextLine();
				}
				while (!userData.contains("/")) {
					System.out.print("Missing '/', try again! : ");
					userData = sc.nextLine();
				}
				while (!userData.contains("(")) {
					System.out.print("Missing '(', try again! : ");
					userData = sc.nextLine();
				}
				while (!userData.contains(")")) {
					System.out.print("Missing ')', try again! : ");
					userData = sc.nextLine();
				}
				while (!userData.contains("(") || !userData.contains(")")) {
					System.out.print("Missing '()', try again! : ");
					userData = sc.nextLine();
				}
			}

		} catch (Exception e) {
			System.out.println("Error in user NRC input!");
		}
		return userData;
	}
}
