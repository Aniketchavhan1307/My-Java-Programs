package array;

public class Find_MissingElement 
{

	public static void main(String[] args)
	{
		int []ar = {1,2,3,4,6,7};
		
		int sum =0;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < ar.length; i++)
		{
			sum+=ar[i];
			
			if(ar[i]> max)
			{
				max = ar[i];
			}
			
		}
		System.out.println(max);
		System.out.println(sum);
		int sumOfNatural = max*(max+1)/2;
		
		System.out.println("The missing element is...."+(sumOfNatural-sum));
		
	}
}
