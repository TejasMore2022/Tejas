package practice2;
import java.util.Scanner;

public class Reverseastring {

	public static void main(String[] args) {
	
		

			Scanner scan=new Scanner(System.in);
			System.out.println("enter array");
			char ar[]=scan.nextLine().toCharArray();
			System.out.println("reversed string is as follows");
			for(int i=ar.length-1;i>=0;i--) {
				
				
				System.out.print(ar[i]);
				
			}
			
	}

}
