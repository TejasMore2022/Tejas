package practice2;

public class Matrixmultiplication3by3 {

	public static void main(String[] args) {

		int ar1[][] = { { 1, 1,1 }, 
			           	{ 1, 1,1 }, 
				        {1, 1, 1 } };

		int ar2[][] = { {2, 1, 1 }, {2, 1, 1 }, {2, 1, 1 } };

		int ar3[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				//ar3[i][j]=0;      // i0 j1 
				for(int k=0;k<3;k++)      
				{      
				ar3[i][j]+=ar1[i][k]*ar2[k][j];
				}
				System.out.print(ar3[i][j]+" ");
			}
			System.out.println();
			
		}

	}
}


//2*2             00*00+01*10
//1 1 1 1         
//1 1 1 1
//1 1

//00 00*00+01*10
//01 00*01+01*11
//10  10*00+11*10
//11 10*01+11*11