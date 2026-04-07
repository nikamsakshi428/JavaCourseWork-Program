package fiftyprog.java;

public class fortysix {

	public static void main(String[] args) 
	{
		HelperClass helper = new HelperClass();
		helper.sayHello();
        MathUtility math = new MathUtility();
		System.out.println("Sum: " + math.add(5, 3));
	}
		
}
class HelperClass 
{
   public void sayHello()
   {
     System.out.println("Hello from HelperClass!");
   }
}
class MathUtility
{
  public int add(int a, int b) 
  {
	 return a + b;
  }
}
