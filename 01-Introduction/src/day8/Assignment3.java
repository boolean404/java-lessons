package day8;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		System.out.println("------------ Assignment 3 by Bo Bo Aung ------------\n");

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter your mark : ");
			int mark = sc.nextInt();

			validateMark(mark);

		} catch (InvalidMarkException e) {
			System.err.println(e.getMessage());

		} finally {
			System.out.println("----------- Bye -----------");
		}
	}

	public static void validateMark(int mark) throws InvalidMarkException {
		if (mark >= 0 && mark <= 100) {
			System.out.println("Your mark is " + mark + " and added!");
		} else {
			throw new InvalidMarkException("Invalid inputted mark!");
		}
	}
}

class InvalidMarkException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidMarkException(String msg) {
		super(msg);
	}
}