package practice2;

import java.util.Scanner;

public class NoOfABInStringg {
	public static void main(String[] args) {

		int cab = 0;

		// find number of time "AB" in string str = "ABBBDFJGGDFABFJFHYDABA";

		String str = "ABBBDFJGGDFABFJFHYDABA";// len 20

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == 'A' && str.charAt(i + 1) == 'B') {

				cab++;

			}

		}

		System.out.println("Number of consecutive AB are " + cab);

	}
}

// 0 1 2 3    0 to 3
///    a b