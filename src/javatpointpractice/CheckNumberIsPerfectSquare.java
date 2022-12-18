package javatpointpractice;

import java.sql.Time;
import java.util.Scanner;

public class CheckNumberIsPerfectSquare {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter no 1");
		int a = scan.nextInt();

		int b = (int) Math.sqrt(a);
		if (b * b == a) {

			System.out.println("Perfect");

		} else {

			System.out.println("Imperfect");
		}

	}
}
//