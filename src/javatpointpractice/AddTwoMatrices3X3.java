package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class AddTwoMatrices3X3 {

	public static void main(String[] args) {

		int a[][]= {{5,4,3},
				    {6,3,3},
				    {7,9,3}};
		int b[][]= {{1,3,2},
				    {3,2,2},
				    {2,8,2}};
		
		int c[][]=new int[3][3];
		
		
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
			
			c[i][j]=a[i][j]+b[i][j];
			
			System.out.print(c[i][j]+" ");	
			}
			System.out.println();
		}
		
	}
}