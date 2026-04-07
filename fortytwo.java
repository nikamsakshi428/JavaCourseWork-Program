package fiftyprog.java;

public class fortytwo 
{
	public static String convertToLower(String input)
	{
	   return input.toLowerCase();
    }
     public static void main(String[] args)
     {
		String original = "HELLO JAVA";
		String result = convertToLower(original);  
		System.out.println("Lowercase: " + result);
	 }
}
