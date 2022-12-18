package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _26StringToArray {

	public static void main(String args[]) {

		String st = "welcome to TCS";

		char[] ch = new char[st.length()];

		for (int i = 0; i < st.length(); i++) {
			ch[i] = st.charAt(i);
		}

		for (char each : ch) {

			System.out.print(each);
		}

	}

}
