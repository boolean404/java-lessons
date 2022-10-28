package day10Assignment;

import java.util.Scanner;

public class BankAccount {
	Scanner sc = new Scanner(System.in);

	int accountNo;
	String holderName;
	String pinNo;
	String password;
	int balance = 10_000;

	public BankAccount(int accountNo, String holderName, String pinNo, String password) {
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.pinNo = pinNo;
		this.password = password;
	}

	// start deposit
	public void deposit(int depositAmount) {
		this.balance += depositAmount;
		System.out.println("Success!, Now your account balance is : " + this.balance);
	}
	// end deposit

	// start withdraw
	public void withdraw(int withdrawAmount) throws InsufficientAmountException {
		if (withdrawAmount <= this.balance) {
			int currentBalance = this.balance -= withdrawAmount;
			System.out
					.println("Success! Withdrawed " + withdrawAmount + ".\nYour current Balance is " + currentBalance);
		} else {
			throw new InsufficientAmountException(
					"=> You can't withdraw that amount because your balance is insufficient!\n=> Your card is comming out!");
		}
	}
	// end withdraw

	// start changePassword
	public boolean changePassword(String inputedPinNo) {
		boolean pinStatus = true;
		boolean changedPassStatus = false;
		int inpPinCount = 1;
		while (!this.pinNo.equals(inputedPinNo)) {
			System.err.print("Invalid PIN Number, try again : ");
			inputedPinNo = sc.next();
			inpPinCount++;

			if (inpPinCount > 4 && !this.pinNo.equals(inputedPinNo)) {
				System.err.println("\n=> Your account is temporary disabled, Because you inputed 5 times wrong PIN!");
				System.err.println("=> Please go to bank with your NRC Card.");
				pinStatus = false;
				break;
			}
		}

		if (this.pinNo.equals(inputedPinNo)) {
			while (!changedPassStatus) {
				System.out.print("Enter your new Password : ");
				String pass1 = sc.next();
				System.out.print("Confirm your new Password : ");
				String pass2 = sc.next();
				if (pass1.equals(pass2)) {
					this.password = pass1;
					System.out.println("\n--------------------------------");
					System.out.println("=> Password changed successful!");
					System.out.println("--------------------------------\n");
					changedPassStatus = true;
				} else {
					System.err.println("Password doesn't match, try again!");
				}
			}
		}
		return pinStatus;
	}
	// end changePassword

	// start showInfo
	public void showInfo() {
		System.out.println("Your account number is : " + this.accountNo);
		System.out.println("Your account holder name is : " + this.holderName);
		System.out.println("Your account pin number is : " + this.pinNo);
		System.out.println("Your account password is : " + this.password);
		System.out.println("Your account balance is : " + this.balance);
	}
	// end showInfo
}
