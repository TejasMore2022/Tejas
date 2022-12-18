package practice2;

public class R18StringEachLetterAJAY {

	public static void main(String[] args) {

		String ss = "My name is ajay. ajay is boy. ajay play cricket.";

		int a = 0;
		
		String[] st=ss.split(" ");

		for (int i = 0; i <= st.length -1; i++) {
			
			if (st[i].contains("ajay")) {
			

				a++;
			}

		}

		System.out.println(a);

	}
}

//18. Number of occurance of substring from given string String given =
//"My name is ajay. ajay is boy. ajay play cricket."  substring - ajay

