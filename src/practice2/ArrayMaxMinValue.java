package practice2;

//import java.util.Scanner;

public class ArrayMaxMinValue {

	public static void main(String[] args) {
		
		
		int a[]= {10,2,3,4,5};
		int largest=0;
		
		for(int i=0;i<4;i++) {
			
		if(a[i]>a[i+1]) {
			
			largest=a[i];
		}
		else
			largest=a[i+1];
		}
		System.out.println(largest+" is Largest");
		
		
		
		
}
		
		

	}
//0  1 
//char ar[] = {'a','2','B','q','4','F','#'};
//
//Character ch = new Character('7');
//ch = 'A';
//boolean fl1 = Character.isUpperCase(ch);
//System.out.println(fl1);
//boolean fl2 = Character.isLowerCase(ch);
//System.out.println(fl2);
//boolean fl3 = Character.isDigit(ch);
//System.out.println(fl3);
