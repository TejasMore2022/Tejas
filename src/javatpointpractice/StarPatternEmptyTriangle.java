package javatpointpractice;

public class StarPatternEmptyTriangle {

	public static void main(String[] args) {

		int btspace = -1;
		int stspace = 9;
		int rows = 10;// enter number of rows (- 1)

		for (int k = 0; k <= rows; k++) {

			for (int i = 0; i <= stspace; i++) {
				System.out.print(" ");
			}
			System.out.print("*");

			for (int j = 0; j <= btspace; j++) {

				if (k == rows) {
					System.out.print("*");
				} else

					System.out.print(" ");
			}
			btspace++;
			stspace--;
			if (btspace > 0 && btspace % 2 != 0) {

				btspace++;
			}
			if (k > 0) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

//          * 10 space
//         * * 9space+*+space+*
//        *   *
//       *******