package practice;
import java.util.Scanner;
public class Primenumber {

	public static void main(String[] args) {
		Scanner scanobj=new Scanner(System.in);
		System.out.println("Enter no to check prime or not");
		int a=scanobj.nextInt();
		boolean flag = false;
		
		if(a==0 || a==1) {
			
			System.out.println("number is not prime");
			
			
			
		}else 
		
		if(a==2 || a==3)
			System.out.println("number is  prime");
		
		else{
		for (int i=2;i<=a/2;i++) {
			
			if (a%i==0) {
				
				System.out.println("number is not prime");
				flag=false;
				break;
			}
			
			else
				System.out.println("number is prime");
			
			break;
			
		}
		
		
		
		
		}
		
		
	
		
	}
}