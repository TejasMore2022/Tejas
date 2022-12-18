package practice2;
import java.util.Scanner;
public class Numbercompare {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
System.out.println("enter 1st no");
int a=scan.nextInt();
System.out.println("enter 2st no");
int b=scan.nextInt();

if(a>b) {
	
	System.out.println("the value of  is grater than"+b);
}

else if(a==b) {
	
	System.out.println(a=b);
}

else if(a<b) {
	
	System.out.println(a<b);
}
else 
	System.out.println("invalid input");


	}

}
