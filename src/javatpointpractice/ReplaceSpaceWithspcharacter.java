package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ReplaceSpaceWithspcharacter {
	// divide string in 3 equal parts
	public static void main(String[] args) {

		String st = "RePlaCe UpperCase";
		int a = st.length();

		
			st=st.replace(' ','@');
		System.out.println(st);

	}

}
//rEpLAcE uPPERcASE