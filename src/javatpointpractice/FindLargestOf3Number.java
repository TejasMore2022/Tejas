package javatpointpractice;

import java.sql.Time;
import java.util.Scanner;

public class FindLargestOf3Number {

	public static void main(String[] args) {
		 
	
		Scanner scan =new Scanner(System.in);
		System.out.println("enter no 1");
		int a=scan.nextInt();
		System.out.println("enter no 2");
		int b=scan.nextInt();
		
		System.out.println("enter no 3");
		int c=scan.nextInt();
		
		int temp=a>b?a:b;
		int grater=temp>c?temp:c;
		
		System.out.println(grater);
		
		  
		}  
		}  
//