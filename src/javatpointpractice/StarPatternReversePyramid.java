package javatpointpractice;

public class StarPatternReversePyramid {

	public static void main(String[] args) {

		int sspace=3;
		int star=4;
		for(int k=0;k<=4;k++) {                //k contains number of rows
		for(int i=0;i<=sspace;i++) {
		System.out.print(" ");
		}
		for(int j=0;j<=star;j++) {            // * contains no fo columns
		System.out.print("* ");
		}
		System.out.println();
		sspace++;
		star--;
		}
	}

}


//*


//    * * * * *   4 space+*+
//     * * * *  5 space
//      * * *    6 space
//       * * 
//        * 