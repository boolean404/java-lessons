package day8;

import java.util.Scanner;

public class TryFinally1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter slary : ");
			int salary = Integer.parseInt(sc.nextLine());
			if (salary == 0)
				return;
			System.out.println("Your salary is " + salary);
		} finally {
			sc.close();
			System.out.println("finally block executed");
		}
		System.out.println("Outside of try-finally block");
	}
}
