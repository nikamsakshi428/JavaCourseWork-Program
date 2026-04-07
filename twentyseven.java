package fiftyprog.java;

public class twentyseven {

	public static void main(String[] args) 
	{
		        
		        
		        int n = Integer.parseInt(args[0]);

		        int temp = n, r = 0,count=0,sum=0;
		        for(;n!=0;n/=10,++count)
		        {
		            System.out.println("count of digit of no"+count);
		        }
		        while (n > 0) 
		        {
		           
		            sum+=Math.pow(r,count);
		           
		        }
		        if(sum==temp)
		        {
		            System.out.println("armstromg");
		        }
		        else
		        {
		            System.out.println("not armstrong no ");
		        }
	 }
		

}


