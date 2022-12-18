package practice2;

public class ArrayPercentageOfCharacter {
	public static void main(String[] args) {

		char a[] = { 'a', '2', 'B', 'q', '4', 'F', '#' };
		float aU = 0;
		int aL = 0;
		int aI = 0;
		int aSC = 0;
		float total=a.length;

		for (int i = 0; i < 7; i++) {

			if (Character.isUpperCase(a[i])) {

				System.out.println(a[i] + " is Uppercase");
				aU++;

			} else if (Character.isLowerCase(a[i])) {

				System.out.println(a[i] + " is Lowercase");
				aL++;
			} else if (Character.isDigit(a[i])) {

				System.out.println(a[i] + " is integer Number");
				aI++;
			} else {

				System.out.println(a[i] + " is Special Character");
				aSC++;
			}
		}
		System.out.println("Percenateg of Uppercase Letters are" + ((aU/total)*100));
		System.out.println("Percentage of Lowercase Letters are" + ((aL/total)*100));
		System.out.println("Percentage of Integers are" + ((aI/total)*100));
		System.out.println("Percentage of Special Characters are" + ((aSC/total)*100));
	}
}
