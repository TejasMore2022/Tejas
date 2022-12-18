package practice;
import java.util.Scanner;
public class Findevenorodd {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			System.out.println("enter number to check even or odd");
			int i=scan.nextInt();
			if(i%2==0) {
				
				System.out.println(i+ " is even number");
			}
			
			else
				System.out.println(i+ " is odd number");
		

	}

}
