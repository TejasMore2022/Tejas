package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class DuplicateWordInString {

	public static void main(String[] args) {

		String st = "We have have off off we we we today we";
		//String st1 = st;
		// 4
		int a = st.length();

		String[] st1 = st.split(" ");

		for (int i = 0; i < st1.length; i++) {
			
			// 0 to 2
			int count = 0;
			for (int j = i + 1; j < st1.length ; j++) {// 1 to 3

				if (st1[j].equals(st1[i]) ) {

					count++;
					st1[j]="0";

				}

			}
			
			if (count > 0 && st1[i]!="0") {

				System.out.println("count of " + st1[i] + " " + (count + 1));
			}
		}

	}//

}
