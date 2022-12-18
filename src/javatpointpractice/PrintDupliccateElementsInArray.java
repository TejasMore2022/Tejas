package javatpointpractice;

import java.sql.Time;
import java.util.Scanner;

public class PrintDupliccateElementsInArray {

	public static void main(String[] args) {

		int a[] = { 1, 1, 2, 2, 3, 4, 1, 5, 6, 2, 1 };

		for (int i = 0; i < a.length; i++) {// 0

			for (int j = i + 1; j < a.length; j++) {// 1

				if (a[j] == a[i]) {

					System.out.println(a[j] + " is duplicate element");

				}
				break;

			}

		}

	}
}