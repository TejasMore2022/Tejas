package practice2;
import java.util.Scanner;
public class Fibonancy {

	public static void main(String[] args) {
		

				Scanner scan=new Scanner(System.in);
				System.out.println("enter number 1");
				int a=scan.nextInt();
				System.out.println("enter number 2");
				int b=scan.nextInt();
				
				for (int i=0;i<=12;i++) {
					
					System.out.print(a+" ,");
				int c=a+b;
				a=b;
				b=c	;	
				}
				
				
				
				
				
				

	}

}
//0,1