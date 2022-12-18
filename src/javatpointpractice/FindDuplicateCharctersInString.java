package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FindDuplicateCharctersInString {

	public static void main(String[] args) {

		String st1 = "We have off todayy";

		for (int i = 0; i < st1.length(); i++) {

			// 0 to 2
			int count = 0;
			for (int j = i + 1; j < st1.length(); j++) {// 1 to 3

				if (st1.charAt(j) == st1.charAt(i)) {

					count++;
					st1.replace(st1.charAt(j), '0');

				}

			}

			if (count > 0 && st1.charAt(i) != '0' && st1.charAt(i) != ' ') {

				System.out.println("count of " + st1.charAt(i) + " " + (count + 1));
			}
		}

	}

}
