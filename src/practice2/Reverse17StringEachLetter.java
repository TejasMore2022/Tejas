package practice2;

public class Reverse17StringEachLetter {

	public static void main(String[] args) {

		String ss = "India is my country";

		String[] st2 = ss.split(" ");

		for (int i = 0; i < st2.length; i++) {
			StringBuilder sb = new StringBuilder();// each time create new object

			sb.append(st2[i]);

			sb.reverse();// aidnI

			System.out.print(sb + " ");
		}

	}
}

