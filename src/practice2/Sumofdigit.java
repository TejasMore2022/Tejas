package practice2;

import java.util.Scanner;

public class Sumofdigit {

	public static void main(String[] args) {
		int num, sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		num = scan.nextInt();

		for(sum=0;num!=0;num=num/10) {
			
			
			sum=sum+num%10;
			
		}
		System.out.println("sum of digits"+sum);
		
		
		
	}
}