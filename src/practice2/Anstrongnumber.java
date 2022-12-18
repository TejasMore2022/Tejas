package practice2;

public class Anstrongnumber {

	public static void main(String[] args) {

		int num = 153;// number to be checked
		int numcheck = num;
		int reminder = 0;
		int digit = 0;
		int finalnum = 0;
		while (numcheck != 0) {

			reminder = numcheck % 10;
			finalnum = finalnum + (reminder * reminder * reminder);

			numcheck = numcheck / 10;
		}

		if (finalnum == num) {

			System.out.println("is amstrong");
		} else
			System.out.println("is not amstrong");

	}

}

// 1 cube+ 5 c+3c=153

//last digit