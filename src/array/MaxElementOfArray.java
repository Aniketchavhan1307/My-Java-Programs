package array;


public class MaxElementOfArray
{
	public static void main(String[] args) 
	{
		int []ar = {1,33,5,335,35,1,3,0,-3,36,311,22};
		
		int max = Integer.MIN_VALUE;			// -2147483648
		
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i]>max)
			{
				max = ar[i];
			}
		}
		
		System.out.println(max);
		
	}

}
