package javatpointpractice;

public class PeligrimNumber {

	public static void main(String[] args) {

		int num = 545;// number to be checked
		int numcheck=num;
		int reminder=0;
		int finalnum=0;
		while (numcheck!=0) {
			
			reminder=numcheck%10;
			finalnum=(finalnum*10)+reminder;
			numcheck=numcheck/10;
		}
		if(finalnum==num) {
System.out.println("it is PeligrimNumber");
		}
		else {
			System.out.println("it is not PeligrimNumber");
		}
	}

}

// 121
//last digit
//1
//                             