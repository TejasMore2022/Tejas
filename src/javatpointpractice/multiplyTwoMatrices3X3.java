package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class multiplyTwoMatrices3X3 {

	public static void main(String[] args) {

		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				for (int k = 0; k < 3; k++) {

					c[i][j] += a[i][k] * b[k][j];

				}

				System.out.print(" " + c[i][j]);
			}

			System.out.println();

		}

	}
}
//00*00+01*10+02*20 
//00*01+01*11
