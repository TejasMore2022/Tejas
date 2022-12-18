package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LowerTriangularMatrix3X3 {

	public static void main(String[] args) {

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 9, 7 } };
		int b[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 8, 9, 7 } };

		int count = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (j > i) {
					continue;
				}

				System.out.print(a[i][j] + " ");

			}
			System.out.println();

		}

	}
}
// i 0 1   0 2    1 2
// 0 0 