package day8;

import java.util.Scanner;

public class TryCatch1 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter number 1 : ");
			int num1 = Integer.parseInt(sc.nextLine());
			System.out.print("Enter number2 : ");
			int num2 = Integer.parseInt(sc.nextLine());
			int result = num1 / num2;
			System.out.println("Result is " + result);
			sc.close();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Outside try catch clause");
	}
}
