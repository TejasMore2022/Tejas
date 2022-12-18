package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {

		int temp=0;
		int a[] = { 1, 1, 2, 2, 3, 4, 1, 5, 6, 2, 1 };

		
		
		
		LinkedHashSet<Integer> data=new LinkedHashSet<>();
		
		
		for(int i=0;i<a.length;i++) {
		data.add(a[i]);
		
		}
		System.out.println(data);
	}
}