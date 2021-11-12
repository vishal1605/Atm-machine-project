package com.atm.machine;

import java.util.List;
import java.util.Scanner;

public class StartMachine {

	public static String name;
	public static String password;
	static double balance, withdraw;
	static String newPassword;

	public static void main(String[] args) {

		System.out.println("Please enter name and password");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		password = sc.nextLine();
		Authentication a = new Authentication();
		User user = a.getUser(name, password);
		if (user == null) {
			System.out.println("Please try again");
		} else {
			balance = user.getAmount();
			System.out.println("Welcome :" + user.getName());
			System.out.println("Press 1 for withdraw");
			System.out.println("Press 2 balance enquiry");
			System.out.println("Press 3 reset Password");
			System.out.println("Press 4 cancel");
			System.out.print("Choose the operation you want to perform:");
			while (true) {

				int choose = sc.nextInt();
				switch (choose) {
				case 1:
					System.out.println("Enter amount please");
					withdraw = sc.nextInt();
					if (withdraw < balance) {
						balance = balance - withdraw;
						System.out.println("Please collect your cash");
					} else {
						System.out.println("Insuffient balance");
					}
					break;

				case 2:
					System.out.println("Your balance is :" + balance);
					break;

				case 3:
					System.out.println("Please enter your new password");
					newPassword = sc.next();
					System.out.println("Password changed successfully :"+newPassword);
					break;

				case 4:
					System.exit(0);
					break;

				default:

					System.out.println("Wrong option");

				}
			}
		}

	}

}
