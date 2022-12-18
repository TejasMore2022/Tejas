package practice;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter year");
		int a=scan.nextInt();
		if (a%4==0 && a%100!=0 || a%400==0  ) {
			
			System.out.println(a + "  year is Leap year");
		}
			else
				System.out.println(a + "  year is ordinary year");

	
		
	}

}

// it should be divisible by 4 or 400.and not divisible by 100