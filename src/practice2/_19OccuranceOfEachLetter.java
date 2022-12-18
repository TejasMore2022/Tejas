package practice2;

import java.util.Scanner;

public class _19OccuranceOfEachLetter {

	public static void main(String args[]) {

		int i;
		String str = "Please";

		int counter[] = new int[400];

		for (i = 0; i < str.length(); i++) {

			counter[(int) str.charAt(i)]++;

		}

		for (i = 0; i < 400; i++) {

			if (counter[i] != 0) {

				System.out.println(" occurance of " + (char) i + "is " + counter[i]);

			}

		}
	}
}
