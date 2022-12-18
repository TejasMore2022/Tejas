package practice2;

public class VowelConsoInArray {

	public static void main(String[] args) {

		String a = "ISTQB classes starting soon";

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
					|| a.charAt(i) == 'u' || a.charAt(i) == 'A' || a.charAt(i) == 'E' || a.charAt(i) == 'I'
					|| a.charAt(i) == 'O' || a.charAt(i) == 'U')

			{
				System.out.println(a.charAt(i) + " it is vowel");
			} else {
				System.out.println(a.charAt(i) + " conso");
			}
		}
	}
}

//if a[i]==
