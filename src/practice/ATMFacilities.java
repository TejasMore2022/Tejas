package practice;

import java.util.Scanner;

public class ATMFacilities {

	
	public static void main(String[] args) {

		int rembalance = 1000;
		
		int wid = 0;
		int deposit=0;
		 int pin = 7899;
		int number;
		long acc;

		Scanner scan = new Scanner(System.in);

		System.out.println(" Hello! welcome to bank of india");
		System.out.println("please enter your PIN");

		int pin1 = scan.nextInt();

		if (pin1 == pin) {

			System.out.println("login succes");
			System.out.println("1 for Widrawl");
			System.out.println("2 for balance");
			System.out.println("3 for pinchange");
			System.out.println("4 for Transfer money to any account");
			System.out.println("5 for Deposite money to your account");

			System.out.println("Enter number as per operation");
			number = scan.nextInt();

			if (number == 1) {

				System.out.println("enter amout u want to widraw");
				wid = scan.nextInt();
				rembalance = rembalance - wid;
				System.out.println("your rem balance is " + rembalance);
			}else

			if (number == 2) {

				System.out.println("Your balance is" + rembalance);

			}else
			if (number == 3) {

				System.out.println("enter your new pin");
				 pin = scan.nextInt();
				System.out.println("your pin changed successfully,your new pin is " + pin);
			}else
			if (number == 4) {

				System.out.println("enter 10 digit acc no you want to transfer");
				acc = scan.nextLong();
				System.out.println("enter money you want to transfer");
				wid = scan.nextInt();
				rembalance = rembalance - wid;
				System.out.println("your rem balance is " + rembalance);
			}else if (number == 5) {

				System.out.println("enter amout u want to deposit");
				deposit = scan.nextInt();
				rembalance = rembalance + deposit;
				System.out.println("your rem balance is " + rembalance);
		} 
		}

		else {

			System.out.println("try after 24 hours");
		}
System.out.println("thank you for using BOI ATM service");


	}

	}


//bal