package practice2;

public class Matrixaddition2by2 {

	public static void main(String[] args) {

		int ar1[][] = { { 1, 1 }, { 1, 1 } };

		int ar2[][] = { { 1, 1 }, { 1, 1 } };

		int ar3[][] = new int[2][2];

		for (int i = 0; i <= 1; i++) {

			for (int j = 0; j <= 1; j++) {

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