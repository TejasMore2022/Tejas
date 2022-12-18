package javatpointpractice;

public class StarPatternDiamondShape {

	public static void main(String[] args) {

		int space = 5;
		int star = 0;
		int bspace = 0;
		for (int k = 0; k <= 10; k++) {
			for (int i = 0; i <= space; i++) {

				System.out.print(" ");

			}

			for (int j = 0; j <= star; j++) {

				System.out.print("*");

				for (int l = 0; l <= bspace; l++) {

					System.out.print(" ");
				}

			}
			System.out.println();
			if (k <= 4) {

				space--;
				star++;

			} else {
				space++;
				star--;
			}

		}
	}

}

//        * 
//       * * 
//      * * * 
//     * * * * 
//    * * * * * 
//   * * * * * *
//    * * * * *   4 space 5 star 
