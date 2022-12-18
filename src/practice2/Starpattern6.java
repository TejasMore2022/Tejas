package practice2;

public class Starpattern6 {

	public static void main(String[] args) {

		int str = 1;
		int sp = 3;

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= sp; j++) {

				System.out.print(" ");

			}
			for (int j = 1; j <= str; j++) {

				System.out.print("*");

			}

			sp--;
			System.out.println();
		}

	}

}

// 
//    *
//   *
//  *
// *
//* 

// for 

//	4 space
//for print *
//--
