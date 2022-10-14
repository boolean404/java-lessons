package day3;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		 userProfile();
	}
	
	public static void userProfile() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.print("Enter your email : ");
		String email = sc.nextLine();
		

		System.out.print("Enter your phone : ");
		String phone = sc.nextLine();
		
		System.out.print("Enter your education : ");
		String education = sc.nextLine();
		
		System.out.print("Enter your income : ");
		double income = Double.parseDouble(sc.nextLine());
		
		System.out.println("Enter your age : ");
		int age = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		// your profile result
		System.out.println("______Your Profile______");
		System.out.println("Name is : " + name);
		System.out.println("Email is : " + email);
		System.out.println("Phone is : " + phone);
		System.out.println("Education is : " + education);
		System.out.println("Income is : " + income);
		System.out.println("Age is : " + age);

		
	}
}
