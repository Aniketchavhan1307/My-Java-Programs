package array;

import java.util.Arrays;


public class SwapWithoutTemp 
{
	public static void main(String[] args) 
	{
		int[]ar = {1,2,3,45,6,8};
		
		int count =0;
		
		for (int i = 0; i < ar.length-1; i++) 
		{
			int ct =0;
			for (int j = 0; j < ar.length-1-i; j++) 
			{
				if(ar[j] > ar[j+1])
				{
					ar[j]=ar[j]+ar[j+1];
					
					ar[j+1] = ar[j] - ar[j+1];
					
					ar[j] = ar[j] - ar[j+1];
					ct++;
				}
			}
			
			
			count++;
			
			if(ct == 0)
			{
				System.out.println(count+" pass");
				break;
			}
		}
		
		System.out.println(count);
		System.out.println(Arrays.toString(ar));
		
	}

}
