package day8;

import java.util.Scanner;

public class TryWithResource1 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter your name : ");
			String name = sc.nextLine();
			sc.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
