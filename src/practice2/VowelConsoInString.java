package practice2;

public class VowelConsoInString {

	public static void main(String[] args) {

		char a[] = { 'A', 'b', 'c', 'e', 'i', 'p', 'q' };

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E'
					|| a[i] == 'I' || a[i] == 'O' || a[i] == 'U')

			{
				System.out.println(a[i] + " it is vowel");
			} else {
				System.out.println(a[i] + " conso");
			}
		}
	}
}

//if a[i]==
