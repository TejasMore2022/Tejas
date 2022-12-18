package practice2;

public class Matrixaddition3by3 {

	public static void main(String[] args) {

		int ar1[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		int ar2[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		int ar3[][] = new int[3][3];// here write actual length

		for (int i = 0; i <= 2; i++) {

			for (int j = 0; j <= 2; j++) {

				ar3[i][j] = ar1[i][j] + ar2[i][j];
				System.out.print(ar3[i][j] + " ");
			}
			System.out.println();
		}

	}

}

// 2 by 2 matrix
// add respective element
// i=o and j=0