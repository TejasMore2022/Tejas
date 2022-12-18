package javatpointpractice;

import sun.security.util.Length;

public class NumbertoString {

	
	public static void main(String[] args) {

		  int num=11;
		  
		  String sd[]= {"zero","one","two","three","four","five","six","seven","eight","niine"};
		  String dd[]= {"ten","eleven","two","three","four","five","six","seven","eight","niine"};
		 
		  if(num/10==0) {
			  
			  System.out.println("it is single digit");
			  System.out.println(sd[num%10]);
			  
		  }else if(num/10>0) {
			  
			  System.out.println("it is double digit");
			  System.out.println(dd[num%10]);
			  
		  }
		  
		
	}

}

//1