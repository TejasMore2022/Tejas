package javatpointpractice;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class multiplyTwoMatrices2X2 {

	public static void main(String[] args) {

		int a[][]= {{1,2},
				    {3,4}};
		int b[][]= {{1,8},
				   {9,5}};
		
		int c[][]=new int[2][2];//19 18
		                        //39 44
		
		for(int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				for(int k=0;k<=1;k++) {
			c[i][j]+=(a[i][k]*b[k][j]);
			
				
	
			}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			}
		
	}
}


//00*00+01*10 
//00*01+01*11




