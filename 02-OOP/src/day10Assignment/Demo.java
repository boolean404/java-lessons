package day10Assignment;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {

		// start read me first section
		// you can change default account details, password length must be greater than
		// 5 (dont't change field name).
		int userAccountNo = 0003_1002_0001;
		String userAccountHolderName = "Bo Bo Aung";
		String UserAccountPinNo = "123456";
		String UserAccountPassword = "maungbo";
		// end read me first section

		System.out.println("--------------- Day10 OOP Assignment by Bo Bo Aung ----------------\n");
		Scanner sc = new Scanner(System.in);
		boolean programStatus = true;

		try {
			BankAccount bankAcc = new BankAccount(userAccountNo, userAccountHolderName, UserAccountPinNo,
					UserAccountPassword);

			// init data
			String password = bankAcc.password;

			// welcome
			System.out.println("------------Weclome to MMITC Banking -------------");
			System.out.print("Enter your account password for using servie : ");
			String inpPass = sc.next();

			// start password check
			int inpPassCount = 1;
			while (!password.equals(inpPass)) {
				System.err.print("Wrong password, try again : ");
				inpPass = sc.next();
				inpPassCount++;

				if (inpPassCount > 4 && !password.equals(inpPass)) {
					System.err.println(
							"\n=> Your account is temporary disabled, Because you inputed 5 times wrong password!");
					System.err.println("=> Please go to bank with your NRC Card.");
					return;
				}
			}
			// end password check
			System.out.println("\n-------------------");
			System.out.println("=> Password correct!");
			System.out.println("-------------------");

			// start program status
			while (programStatus) {

				System.out.println("\n----------- All Services Details -------------");
				System.out.println("1. Deposit Money");
				System.out.println("2. Withdraw Money");
				System.out.println("3. Change Password");
				System.out.println("4. Show My Information");
				System.out.println("5. Exit & Take Out My Card\n");

				boolean inpMenuNumStatus = false;

				while (!inpMenuNumStatus) {
					System.out.print("Enter a number for you wanna to process : ");
					while (sc.hasNext("[a-zA-Z]+")) {
						System.err.print("Don't input letter!, try again : ");
						sc.next();
					}

					int serviceNum = sc.nextInt();

					if (serviceNum >= 1 && serviceNum <= 4) {
						System.out.println("\n-------------------");
						System.out.println("=> Selected : " + serviceNum);
						System.out.println("-------------------\n");
					}

					switch (serviceNum) {
					case 1: {
						System.out.println("------------- Deposit Process --------------");
						System.out.print("Enter your deposit amount : ");
						int depositAmount = sc.nextInt();
						bankAcc.deposit(depositAmount);
						inpMenuNumStatus = true;
						break;
					}
					case 2: {
						System.out.println("------------- Withdraw Process --------------");
						System.out.print("Enter your withdraw amount : ");
						int withdrawAmount = sc.nextInt();
						bankAcc.withdraw(withdrawAmount);
						inpMenuNumStatus = true;
						break;
					}
					case 3: {
						System.out.println("------------- Password Change Process --------------");
						System.out.print("Enter your PIN Number to change a new password : ");
						String inpPin = sc.next();
						boolean pinStatus = bankAcc.changePassword(inpPin);
						inpMenuNumStatus = true;
						if (!pinStatus) {
							return;
						}
						break;
					}
					case 4: {
						System.out.println("------------- User Account Information --------------");
						bankAcc.showInfo();
						inpMenuNumStatus = true;
						break;
					}
					case 5: {
						System.out.println("\n------------- Exiting From Services --------------");
						System.out.println("=> Please come back later!");
						inpMenuNumStatus = true;
						programStatus = false;
						return;
					}
					default: {
						System.err.println("Inputted number doesn't exist!, try again.");
					}

					}
					if (programStatus) {
						System.out.print("\n=> Going to Home Page.....");
					}
				}
			}

			// end program status

		} catch (InsufficientAmountException e) {
			System.err.println(e.getMessage());
		} finally {
			sc.close();
			System.out.println("\n---------- Thank you for choosing MMITC Banking, Have a great day! --------------");
		}

	}
}
