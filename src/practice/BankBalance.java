package practice;

import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args) {

		int rembalance = 1000;

		int wid = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("enter amout u want to widraw");
		wid = scan.nextInt();

		if (wid > rembalance) {

			System.out.println("insufficient funds");

		} else if (wid <= rembalance) {

			rembalance = rembalance - wid;
			System.out.println("remaining balance is " + rembalance);

		}

	}

}

//bal