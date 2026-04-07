package fiftyprog.java;

public class thirtyone
{
	
	    public static void main(String[] args)
	     {
	        
	        
	        int n = Integer.parseInt(args[0]);

	        int temp = n, res = 0;
	        while (n > 0) 
	        {
	           int rem =  n % 10;
	            res=(res*10)+rem;
	            n= n/ 10;
	        }

	        if (res == temp)
	        {
	            System.out.println("Palindrome");
	        }
	        else
	        {
	            System.out.println("Not Palindrome");
	        }
	    
	    }
	} 

	    