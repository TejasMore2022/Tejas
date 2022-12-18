package javatpointpractice;

public class StarPatternRight2 {

	public static void main(String[] args) {

		int space=5;
		int star=0;
		for(int k=0;k<=5;k++) {
		for(int i=0;i<=space;i++) {
			
			
			System.out.print(" ");
		
		}
			for(int j=0;j<=star;j++) {
				
				System.out.print("*");
			}
		System.out.println();
		space--;
		star++;
		}
	}

}

//     *     5space                           
//    **     4 space 2 *











//int star=5;
//for(int j=0;j<=5;j++) {
//for(int i=0;i<=star;i++) {
//	System.out.print("*");
//	
//}
//star--;
//System.out.println();
//}