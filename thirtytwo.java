package fiftyprog.java;

public class thirtytwo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	   int[][] matrixA = {{2, 4, 6},{1, 3, 5}};
       int[][] matrixB = {{7, 8, 9},{4, 2, 0}};
       int[][] sum = new int[2][3];
       for (int i = 0; i < 2; i++)
       {
		  for(int j = 0; j < 3; j++)
		  {
		    sum[i][j] = matrixA[i][j] + matrixB[i][j];
		  }
	   }
       System.out.println("Sum of the two matrices:");
		        for (int[] row : sum) 
		        {
		            for (int value : row)
		            {
		                System.out.print(value + "\t");
		            }
		            System.out.println();
		        }
	 }
}
