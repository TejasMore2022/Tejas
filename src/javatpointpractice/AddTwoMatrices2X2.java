package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class AddTwoMatrices2X2 {

	public static void main(String[] args) {

		int a[]= {0,1};
		int b[]= {1,1};
		
		int c[]=new int[2];
		
		
		for(int i=0;i<=1;i++) {
			
			c[i]=a[i]+b[i];
			
			System.out.print(c[i]+" ");	
		}
		
	}
}