package day8;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] division = { "AA", "BB", "CC", "DD", "EE", "FF", "GG", "HH", "II", "JJ", "KK", "LL", "MM", "NN" };

		try {
			System.out.println("-------------Assignment 2 by Bo Bo Aung-------------");
			System.out.print("\nEnter your NRC Information : ");
			String inpNRC = sc.nextLine();

			// indexs
			int index1 = inpNRC.indexOf("/");
			int index2 = inpNRC.indexOf("(");
			int index3 = inpNRC.indexOf(")");
			int index4 = inpNRC.length();

			// NRC data
			String nrcDivision = null;
			int inpDivisionCode = Integer.parseInt(inpNRC.substring(0, index1));

			// start ArrayIndexOutOfBoundsException
			if (inpDivisionCode > division.length) {
				throw new ArrayIndexOutOfBoundsException("The input NRC is invalid.");
			}
			// end ArrayIndexOutOfBoundsException

			for (int i = 0; i < division.length; i++) {
//				inpDivisionCode ==  ? nrcDivision= 
				if ((inpDivisionCode - 1) == Arrays.asList(division).indexOf(division[i])) {
					nrcDivision = division[i];
					break;
				}
			}

			String nrcCity = inpNRC.substring(index1 + 1, index2);
			String nrcNumber = inpNRC.substring(index3 + 1, index4);

			// output
			System.out.println("\n------------output-------------");
			System.out.println("Division/state = " + nrcDivision);
			System.out.println("City = " + nrcCity);
			System.out.println("NRC Number = " + nrcNumber);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		} finally {
			sc.close();
			System.out.println("------------ Bye ------------");
		}
	}
}
