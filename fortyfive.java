package fiftyprog.java;

public class fortyfive
{
     int number = 10;
     public static void staticMethod() 
	 {
		System.out.println("This is a static method.");
	 }
	 public void instanceMethod()
	 {
		System.out.println("This is an instance method.");
		System.out.println("Accessing instance variable: " + number);
	 }
     public static void main(String[] args)
	 {
	    fortyfive.staticMethod();
        fortyfive obj = new fortyfive();
		obj.instanceMethod();
	 }
}
