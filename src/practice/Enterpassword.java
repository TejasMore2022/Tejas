package practice;
import java.util.Scanner;
public class Enterpassword {

	public static void main(String[] args) {
	

		Scanner scan=new Scanner(System.in);
		int pass=1234;
		System.out.println("please enter password");
		int actual=scan.nextInt();
		
		if(actual==pass) {
			
			
			System.out.println("u logged in succefully");
			}
		
		else
		{
			System.out.println("inncorrect password plase enter again");
			actual=scan.nextInt();	
			
			
			if(actual==pass) {
				
				
				System.out.println("u logged in succefully");
				}
			else if(actual!=pass) {
				
				
				System.out.println("inncorrect password plase enter again");
				}
			
			actual=scan.nextInt();	
			
			
			if(actual==pass) {
				
				
				System.out.println("u logged in succefully");
				}
			else if(actual!=pass) {
				
				
				System.out.println("inncorrect password plase try after 24 hours");
				}
			
		
		}
		
		
	}

	}
