package javatpointpractice;

import java.sql.Time;
import java.util.Scanner;

public class tocopyallelementsofonearrayintoanotherarray {// first 10

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 7, 9 };

		int b[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			b[i] = a[i];

		}

		for (int each : b) {

			System.out.println(each);

		}

	}

}
//