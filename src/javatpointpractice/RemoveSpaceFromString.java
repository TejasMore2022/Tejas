package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveSpaceFromString {
	// divide string in 3 equal parts
	public static void main(String[] args) {

		String st = "remove space from string";
		int a = st.length();

		for (int i = 0; i < st.length(); i++) {

			if (st.charAt(i) != ' ') {

				System.out.print(st.charAt(i));

			}

		}

	}

}
