package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _24PallendromStrint_abba {

//	24. Pallendrom strint abba = abba
	public static void main(String args[]) {

		String st1 = "wow";
		String st2 = "";

		for (int i = st1.length() - 1; i >= 0; i--) {

			st2 = st2 + st1.charAt(i);

		}
		if (st2.equals(st1)) {// use .equals method as it checks the string content.==checks only object

			System.out.println("p");
		} else {

			System.out.println("n p");
		}

	}

}
