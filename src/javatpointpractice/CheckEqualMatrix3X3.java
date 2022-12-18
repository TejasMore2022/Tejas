package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CheckEqualMatrix3X3 {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 9, 7 } };
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 9, 7 } };

		int count = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (a[i][j] == b[i][j]) {

					count++;

				}
			}

		}

		if (count == (a.length*b.length)) {

			System.out.println("equal");
			

		} else {

			System.out.println("not equal");
		}
	}
}
