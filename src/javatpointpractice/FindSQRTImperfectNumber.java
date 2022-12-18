package javatpointpractice;

import java.sql.Time;
import java.util.Scanner;

public class FindSQRTImperfectNumber {

	public static void main(String[] args) {
int z;
		int num = 124;
		int b = num;
		int count = 0;
		while (b != 0) {

			b = b / 2;
			count++;

		}

		
		if(num>36) {
		
		z = count ;
		}else {
		z = count - 1;
		}
		int z1 = count + 1;

		float z2 = num - z * z;
		float z3 = z2 / (2 * z + 1);

		System.out.println("sqrt of num is" + (z + z3));

	}

}
//31 15 7 3 1 0 