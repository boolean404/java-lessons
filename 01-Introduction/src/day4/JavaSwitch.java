package day4;

import java.util.Scanner;

public class JavaSwitch {
	public static void main(String[] args) {

//		switchStatement();
	}
	
	public static void switchStatement() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter food name : ");
		String name = sc.nextLine();
		String catName;
		
		switch (name) {
		case "burger" , "sandwish": 
			catName = "Fast Food";
			break;
			
		case "pizza":
			catName = "FastFood";
		default:
			catName = "unknow";
		}
		System.out.print(name + " is " + catName); 
	}
}
