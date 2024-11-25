package array;

public class MinElementOfArray
{

	public static void main(String[] args) 
	{
		int []ar = {5,1,4,-54,12,454,-65,0,1,2,3};
		
		int min = Integer.MAX_VALUE;            // 2147483647
		
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i] < min)
			{
				min = ar[i];
			}
			
		}
		
		System.out.println(min);
	}
}
