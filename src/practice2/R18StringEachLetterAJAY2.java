package practice2;

public class R18StringEachLetterAJAY2 {

	public static void main(String[] args) {

		String ss = "My name is ajay. ajay is boy. ajay play cricket.";

		int a = 0;

		for (int i = 0; i <= ss.length() - 3; i++) {
			
			if (ss.charAt(i) == 'a' && ss.charAt(i + 1) == 'j' && 
					ss.charAt(i + 2) == 'a' && ss.charAt(i + 3) == 'y') {
			

				a++;
			}

		}

		System.out.println(a);

	}
}

//18. Number of occurance of substring from given string String given =
//"My name is ajay. ajay is boy. ajay play cricket."  substring - ajay

