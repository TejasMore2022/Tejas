package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ReplaceUppercaseToLowerAndViceVersa {
	// divide string in 3 equal parts
	public static void main(String[] args) {

		String st = "RePlaCe UpperCase";
		int a = st.length();

		for (int i = 0; i < st.length(); i++) {

			if (Character.isUpperCase(st.charAt(i))) {

				System.out.print(Character.toLowerCase(st.charAt(i)));

			} else if (Character.isLowerCase(st.charAt(i))) {

				System.out.print(Character.toUpperCase(st.charAt(i)));

			} else {

				System.out.print(st.charAt(i));
			}

		}

	}

}
//rEpLAcE uPPERcASE