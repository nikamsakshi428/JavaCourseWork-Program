package fiftyprog.java;

public class fortynine {

	public static void main(String[] args) 
	{
		int numerator = 10;
		int denominator = 0;
		try
		{
		  int result = numerator / denominator; 
		  System.out.println("Result: " + result);
		} 
		catch (ArithmeticException e) 
	    {
		   System.out.println("Error: Division by zero is not allowed!");
		}
		finally
		  {
		    System.out.println("This block always executes.");
		  }

	 System.out.println("Program continues after exception handling.");
   }
}
