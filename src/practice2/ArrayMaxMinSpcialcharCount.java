package practice2;

public class ArrayMaxMinSpcialcharCount {
	public static void main(String[] args) {

		char a[] = { 'a', '2', 'B', 'q', '4', 'F', '#' };
		int aU = 0;
		int aL = 0;
		int aI = 0;
		int aSC = 0;

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
		System.out.println("Number of Uppercase Letters are" + aU);
		System.out.println("Number of Lowercase Letters are" + aL);
		System.out.println("Number of Integers are" + aI);
		System.out.println("Number of Special Characters are" + aSC);
	}
}
