package javatpointpractice;

public class Prog2PrimenumberBetwn1to100 {

	

		public static void main(String args[]) {
			int i, m = 0, flag = 0;
			for (int n = 0; n <= 100; n++) {
			m = n / 2;
			if (n == 0 || n == 1) {
				System.out.println(n + " is not prime number");
			} else {
				for (i = 2; i <= m; i++) {
					if (n % i == 0) {
						System.out.println(n + " is not prime number");
						flag = 1;
						//break;
					}
				}
				if (flag == 0) {
					System.out.println(n + " is prime number");
				}
			} // end of else
			}
		}
	}

	// 2,3,5,7,11,13,17,19,
	//no div by itself only
	//2



// 9/2 9/3

// 2,3,5,7,11,13,17,19,
//no div by itself only
//2