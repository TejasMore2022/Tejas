package javatpointpractice;

import java.sql.Time;
import java.util.Scanner;

public class PrimeNoBetween1to102 {

	public static void main(String[] args) {

		for (int i = 2; i <= 100; i++) {// 7

			int a = 1;
			for (int j = 2; j <= i / 2; j++) {// 2,3

				if (i % j == 0) {

					a = 0;
				}

			}
			if (a == 1) {

				System.out.println(i + " is prime number");

			}

		}

	}
}
