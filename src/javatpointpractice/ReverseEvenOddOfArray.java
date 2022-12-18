package javatpointpractice;

import java.sql.Time;
import java.util.Scanner;

public class ReverseEvenOddOfArray {

	public static void main(String[] args) {

		int a[] = { 1, 1, 2, 2, 3, 4, 1, 5, 6, 2, 1 };

		for (int i = a.length-1;i>=0; i--) {// 0

			
			if(a[i]%2==0) {
			System.out.println(a[i]);
			}
			
		}

	}
}