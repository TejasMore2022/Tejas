package javatpointpractice;

import java.sql.Time;
import java.util.Arrays;
import java.util.Scanner;

public class LargetsNoInArray {
//odd position print
	public static void main(String[] args) {

		int temp=0;
		int a[] = { 1, 1, 2, 2, 3, 4, 1, 5, 6, 2, 1 };

		for(int i=1;i<a.length;i++) {
		if(i%2==0) {

		System.out.println(a[i]);
		}
		}
	}
}