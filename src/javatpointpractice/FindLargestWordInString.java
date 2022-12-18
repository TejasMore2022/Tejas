package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class FindLargestWordInString {

	public static void main(String[] args) {
		int a = 0;
		String st1 = "I am Tejas. I am Currently Working In TCS";
		String[] st2 = st1.split(" ");

		int temp = 0;
		for (int i = 0; i < st2.length - 1; i++) {

			a = st2[i].length() > st2[i + 1].length() ? st2[i].length() : st2[i + 1].length();
			if (a > temp) {

				temp = a;
			}

		}

		for (int i = 0; i < st2.length; i++) {

			if (st2[i].length() == temp) {

				System.out.println(st2[i]);

			}

		}
	}
}
// I go
//