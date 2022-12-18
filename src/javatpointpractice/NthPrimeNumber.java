package javatpointpractice;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
		 
		  
		
		//constructor of the Scanner class  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the value of n to compute the nth prime number: ");  
		//reading an integer from the user  
		int n = sc.nextInt();   
		int num=1, count=0, i;  
		while (count < n)  
		{  
		num=num+1;  
		for (i = 2; i <= num; i++)  
		{   
		//determines the modulo and compare it with 0   
		if (num % i == 0)   
		{  
		//breaks the loop if the above condition returns true  
		break;  
		}  
		}  
		if (i == num)  
		{  
		//increments the count variable by 1 if the number is prime  
		count = count+1;  
		}  
		}  
		//prints the nth prime number  
		System.out.println("The " +n +"th prime number is: " + num);  
		}  
		}  
//n1   1=2,2=3,3=5,4=7
//n2   3

//n3   5