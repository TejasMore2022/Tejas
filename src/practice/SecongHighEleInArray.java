package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SecongHighEleInArray {

	public static void main(String[] args) {

		int a[] = { 1,7,7,4,5,6,3,55,7,9,4,4,4,5,5,57,57,7,78,8,8,78 };

		Arrays.sort(a);
		int temp = a[a.length - 1];//78

		for (int i = a.length - 1; i >= 0; i--) {

			if (a[i - 1] != temp) {

				System.out.println("second highest element is "+a[i - 1]);
				break;
			}

		}

	

	}

}

