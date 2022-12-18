package practice2;

public class _14StringPercentageOfCharacter {
	public static void main(String[] args) {
		String str="india is my country 3454564 dfghrtherth 567678 drfhft BBCH";

		char[] ab = str.toCharArray();
		
		float aU = 0;
		int aL = 0;
		int aI = 0;
		int aSC = 0;
		float total=ab.length;

		for (int i = 0; i < ab.length; i++) {

			if (Character.isUpperCase(ab[i])) {

				System.out.println(ab[i] + " is Uppercase");
				aU++;

			} else if (Character.isLowerCase(ab[i])) {

				System.out.println(ab[i] + " is Lowercase");
				aL++;
			} else if (Character.isDigit(ab[i])) {

				System.out.println(ab[i] + " is integer Number");
				aI++;
			} else {

				System.out.println(ab[i] + " is Special Character");
				aSC++;
			}
		}
		System.out.println("Percenateg of Uppercase Letters are" + ((aU/total)*100));
		System.out.println("Percentage of Lowercase Letters are" + ((aL/total)*100));
		System.out.println("Percentage of Integers are" + ((aI/total)*100));
		System.out.println("Percentage of Special Characters are" + ((aSC/total)*100));
		
	}
}
