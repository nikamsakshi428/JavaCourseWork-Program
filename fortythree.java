package fiftyprog.java;

public class fortythree {

	public static void main(String[] args)
	{
       String str1 = "Hello";
	   String str2 = "World";
       int length = str1.length();
	   System.out.println("Length of str1: " + length);
	   String combined = str1 + " " + str2;
	   System.out.println("Concatenated String: " + combined);
	   String replaced = combined.replace("World", "Java");
	   System.out.println("Replaced String: " + replaced);
		    
		
	}

}
