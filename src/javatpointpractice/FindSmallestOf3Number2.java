package javatpointpractice;

import java.sql.Time;
import java.util.Scanner;

public class FindSmallestOf3Number2 {

	public static void main(String[] args) {
		 
	
		Scanner scan =new Scanner(System.in);
		System.out.println("enter no 1");
		int a=scan.nextInt();
		System.out.println("enter no 2");
		int b=scan.nextInt();
		
		System.out.println("enter no 3");
		int c=scan.nextInt();
		
		int temp=a>b?b:a;
		int smallet=temp>c?c:temp;
		
		System.out.println(smallet);
		
		  
		}  
		}  
//