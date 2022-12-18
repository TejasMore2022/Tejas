package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _25PallendromNumber353 {

//	_24PallendromNumber353
	public static void main(String args[]) {

		int a = 171;
		int numcheck = a;
		int reva = 0;
		int reminder = 0;

		while (numcheck != 0) {
			reminder = numcheck % 10;
			reva = reva * 10 + reminder;

			numcheck = numcheck / 10;
		}

		if (reva == a) {

			System.out.println("p");
		} else {

			System.out.println("np");
		}
	}

}

//_24PallendromNumber353
//