package fiftyprog.java;

public class fiftyfour 
{
	static int number;
    static 
    {
	   System.out.println("Static block is executed.");
	   number = 42;
	}
    public static void main(String[] args)
    {
	   System.out.println("Main method is running.");
	   System.out.println("Value of number: " + number);
	}
}
