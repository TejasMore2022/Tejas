package javatpointpractice;

public class StarPatternDownwardTriangle {

	public static void main(String[] args) {

		int star=4;
		
		for(int j=0;j<=4;j++) {
		for(int i=0;i<=star;i++) {
		System.out.print("*");
		
		System.out.print(" ");
		}
		System.out.println();
		star--;
		}
	}

}


//*


//* * * * *
//* * * *
//* * * 
//* * 
//* 