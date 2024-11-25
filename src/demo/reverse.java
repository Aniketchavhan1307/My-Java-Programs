package demo;

public class reverse 
{
	public static void main(String[] args)
	{
		reverseno(12345);
		
	}
	
	public static void reverseno(int n)
	{
		int rem=0;
		while(n>0)
		{
		int rev = n%10;
		 rem = rem *10 + rev;
		
		n/=10;
		}
		System.out.println(rem);
		
	}

}
