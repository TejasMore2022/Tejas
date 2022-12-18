package practice;

import java.util.Scanner;

public class NumberSwap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter num1");
		int num1 = scan.nextInt();
		System.out.println("enter num2");
		int num2 = scan.nextInt();

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("two swap no are" + "  " +  num1   + " "  +   num2);

	}

}
