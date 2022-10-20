package day7;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter numeber 1 : ");
			int num1 = sc.nextInt();

			System.out.print("Enter number 2 : ");
			int num2 = sc.nextInt();

			var result = num1 / num2;

			System.out.println("Result : " + result);

			sc.close();
		} catch (NullPointerException e) {
			System.out.println("Error have");
		} catch (ArithmeticException e) {
			System.out.println("Error in Divided by Zero");
		}
		System.out.println("Outside of the try catch block");
	}
}
