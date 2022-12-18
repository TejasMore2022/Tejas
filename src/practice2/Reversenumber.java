package practice2;

public class Reversenumber {

	public static void main(String[] args) {
		int a=123456789;
		int reversed=0;
		
		
		
		while(a!=0) {
			
		int digit=a%10;
		reversed=reversed*10+digit;
		a/=10;
		
		}

		
		System.out.println("reversed  number is  "+reversed);
		
		
	}

}




// 123456789 
//9