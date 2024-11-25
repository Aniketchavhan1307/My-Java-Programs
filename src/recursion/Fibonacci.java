package recursion;

public class Fibonacci
{

	public static void main(String[] args) 
	{
		fibo(5,0,1);
		//System.out.println(fibo(5, 0, 1));
	}
	
	 public static void fibo(int n, int n1 , int n2)
	 {
		if(n==0)
		{
			return;
		}
		else
		{
			 int n3 = n1+n2;
			 System.out.println(n1);
			  
			 fibo(n-1, n2, n3);
		}


		 
	 }
}
