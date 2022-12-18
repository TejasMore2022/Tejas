package javatpointpractice;

public class StarPatternLeftPascalsTriangle {

	public static void main(String[] args) {

		int space = 9;
		int star = 0;

		for (int k = 0; k <= 8; k++) { // this is for 9 rows
			for (int i = 0; i <= space; i++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= star; j++) {

				System.out.print("*");
			}

			System.out.println();
			if (k <= 3) {
				space--;
				star++;
			} else {

				space++;
				star--;
			}

		}
	}

}

//*

//            * 10 space+*
//           ** 9 space+**
//          ***
//         **** 
//        *****
//         ****
//          ***
//           **
//            *
