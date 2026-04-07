package fiftyprog.java;

public class twentyth
{
	
	    public static void main(String args[])
	    { System.out.println("Enter no for reverse:");
	       if (args.length == 0) {
	            System.out.println("Pleas no as a command-line argument.");
	            return;
	        }
	        int n=Integer.parseInt(args[0]);
	        int res=0;
	        while(n>0)
	        {
	            int rem=n%10;
	            res=(res*10)+rem;
	            n=n/10;
	        }
	        System.out.println(res);
	    }
	
}
