package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _23StringSwapWithoutUsingThird {

//	 22. print substring between "AB" in string str = "ABBBDFJGGDFABFJFHYDAB"; 

	public static void main(String args[]) {

		String str1 = "ABCD";
		String str2 = "PQRS";
		
		int a=str1.length();
		
		str1=str1.concat(str2);
		
		str2=str1.substring(0, a);
		str1=str1.substring(a);
		
		System.out.println("value of str1 is "+str1+" "+"value of str2 is "+str2);
		

		}

	}



