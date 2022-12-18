package javatpointpractice;

public class StarPatternSandGlass {

	public static void main(String[] args) {

		int dspace = -1;
		int star = 8;
		for (int k = 0; k <= 16; k++) {
		for (int j = 0; j <= dspace; j++) {
			System.out.print(" ");
		}

		for (int i = 0; i <= star; i++) {
			System.out.print("* ");
		}

		System.out.println();
		if (k <8) {

			dspace++;
			star--;
			
			if(k==7) {
				System.out.println("        *");
				
			}
		} else {

			dspace--;
			star++;
		}
		}
	}

}

//* * * * * * * * *
// * * * * * * * *
//  * * * * * * *
//   * * * * * *
//    * * * * *
//     * * * *
//      * * *
//       * * 7
//        * 8 star=0   8 space dspace 8