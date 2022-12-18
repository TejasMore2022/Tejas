package practice2;
import java.util.Scanner;

public class NoOfABInString {
	public static void main(String[] args) {

		
		
		
		
		String str = "India is my country 3454564 dfghrtherth 567678 drfhft BBCH";
		char ch[]=str.toCharArray();
		
		float aU = 0;
		int aL = 0;
		int aI = 0;
		int aSC = 0;
		float total=ch.length;

		for (int i = 0; i < ch.length; i++) {

			if (Character.isUpperCase(ch[i])) {

				System.out.println(ch[i] + " is Uppercase");
				aU++;

			} else if (Character.isLowerCase(ch[i])) {

				System.out.println(ch[i] + " is Lowercase");
				aL++;
			} else if (Character.isDigit(ch[i])) {

				System.out.println(ch[i] + " is integer Number");
				aI++;
			} else {

				System.out.println(ch[i] + " is Special Character");
				aSC++;
			}
		}
		System.out.println("Percenateg of Uppercase Letters are" + ((aU/total)*100));
		System.out.println("Percentage of Lowercase Letters are" + ((aL/total)*100));
		System.out.println("Percentage of Integers are" + ((aI/total)*100));
		System.out.println("Percentage of Special Characters are" + ((aSC/total)*100));
	}
}

//str[0]





