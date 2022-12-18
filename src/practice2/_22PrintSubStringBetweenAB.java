package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _22PrintSubStringBetweenAB {

//	 22. print substring between "AB" in string str = "ABBBDFJGGDFABFJFHYDAB"; 

	public static void main(String args[]) {

		String str = "ABBBDFJGGDFABFJFHYDAB";

		String ab[] = str.split("AB");

		for (int i = 0; i < ab.length; i++) {

			System.out.print(ab[i]);

		}

	}

}

//	 22. print substring between "AB" in string str = "ABBBDFJGGDFABFJFHYDAB";
//"ABBB"
