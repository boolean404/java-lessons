package day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment2 {
	public static void main(String[] args) throws IOException {
		userProfile();
		
	}
	
	public static void userProfile() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter your name : ");
		String name = br.readLine();
		
		System.out.print("Enter your email : ");
		String email = br.readLine();
		
		System.out.print("Enter your phone : ");
		String phone = br.readLine();
		
		System.out.print("Enter your education : ");
		String education = br.readLine();
		
		System.out.print("Enter your income : ");
		double income = Double.parseDouble(br.readLine());
		
		System.out.println("Enter your age : ");
		int age = Integer.parseInt(br.readLine());
		
		br.close();
		
		System.out.println("__________Your Profile_________-");
		System.out.println("Name is : " + name);
		System.out.println("Email is : " + email);
		System.out.println("Phone is : " + phone);
		System.out.println("Education is : " + education);
		System.out.println("Income" + income);
		System.out.println("Age is : " + age);
		
		
		
	}
}
