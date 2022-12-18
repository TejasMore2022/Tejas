package practice2;

public class Reverse16Array {

	public static void main(String[] args) {
		// we can not add array
		// but we can add string

		String str[] = { "India", "is", "my", "country" };

		String revstr[] = new String[(str.length) - 1];

		for (int i = str.length - 1; i >= 0; i--) {

			System.out.print(str[i]);

		}

	}

}

