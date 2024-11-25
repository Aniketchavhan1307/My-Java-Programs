package array;

import java.util.Arrays;

public class BobbleSort1 
{
	public static void main(String[] args) 
	{
		//int[] ar = {5,6,3,2,-65,0,-62,59,4};
	//	int[]ar = {1,2,3,4,7,5,6};
		
		//char [] ar = {'a','b','c','e','t','l','p','q','E','A'};
		
		char [] ar = {'a','b','c','A','e','f','g','h'};
		
		int count = 0;
		
		for (int i = 0; i < ar.length-1; i++) 
		{
			int ct=0;
			
			for (int j = 0; j < ar.length-1-i; j++) 
			{
				if(ar[j]>ar[j+1])
				{
					char temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1]= temp;
					ct++;
				}
			}
			//System.out.println("ct of if block....."+ct);
			
			count++;
			if(ct ==0)
			{
				
				break;
			}
			
	}
		System.out.println("count of pass.........."+count);
		System.out.println(Arrays.toString(ar));
	}

}
