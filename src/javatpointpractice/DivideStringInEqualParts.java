package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DivideStringInEqualParts {
	// divide string in 3 equal parts
	public static void main(String[] args) {

		String st = "aaaabbbbcccc";
		int a = st.length();// 12
		int b = 3;
		int count = 0;

		for (int i = 0; i < st.length(); i++) {

			System.out.print(st.charAt(i));

			if ((i + 1) % 4 == 0) {

				System.out.println();

			}

		}

	}

}
