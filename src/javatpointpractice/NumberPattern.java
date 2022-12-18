package javatpointpractice;

public class NumberPattern {

	public static void main(String[] args) {

		
		int rownum=1;
		for(int j=1;j<=10;j++) {
		for(int i=1;i<=rownum;i++) {
		System.out.print(i);
		}
		System.out.println();
		rownum++;
		}
	}

}

//1
//12
//123
//1234