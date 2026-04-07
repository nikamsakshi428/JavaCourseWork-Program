package fiftyprog.java;

import java.util.Scanner;

public class thirtythree 
{

	public static void main(String[] args)
	{

	 int[][] firstMatrix = {{3, -2, 5},{3, 0, 4}};
     int[][] secondMatrix ={{2, 3},{-9, 0},{0, 4}};
	 int[][] product = new int[2][2];
	 for (int i = 0; i < 2; i++) 
	 {
		for (int j = 0; j < 2; j++)
		{
		   for (int k = 0; k < 3; k++) 
		   {
		       product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
		   }
		}
	 }
	 System.out.println("Multiplication of two matrices:");
	 for (int[] row : product) 
	 {
	     for (int value : row)
	     {
		    System.out.print(value + "\t");
		 }
		 System.out.println();
		       
	 }
   }	
}
