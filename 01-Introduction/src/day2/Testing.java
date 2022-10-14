package day2;

import java.util.Scanner;

public class Testing {
	public static void main(String[] args) {
		multiPrice();
	}
	
	public static void multiPrice() {
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Multi Calculator");
		
		System.out.print("Enter num1 : ");
		num1 = sc.nextInt();
		
		System.out.print("Enter num2 : ");
		num2 = sc.nextInt();
		
		System.out.println("Multi Value is : " + (num1 * num2));
		sc.close();
		
		
	}
}
