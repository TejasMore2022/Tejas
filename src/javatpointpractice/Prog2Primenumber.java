package javatpointpractice;

public class Prog2Primenumber {

	public static void main(String args[]) {
		
		int n=9;
		int b=1;//this int taken to made provision for 2&3 as prime number
		
		if(n==0 || n==1) {
			System.out.println("number not prime");
		}else {	
			
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {//here do not use if else
				b=0;
			}
			
		}
		if(b==0) {
			System.out.println("number is not prime");
		}else
			System.out.println("number is  prime");
		
		}
			
		} // end of else
		
	}


// 2,3,5,7,11,13,17,19,
//no div by itself only
//2




