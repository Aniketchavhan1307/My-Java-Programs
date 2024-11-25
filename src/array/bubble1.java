package array;

import java.util.Arrays;

public class bubble1
{
	
	public static void main(String[] args) 
	{
		int []ar = {1,2,35,3,4,5,6};
		
		bubbleSort(ar);
		System.out.println(Arrays.toString(ar));
		
	}
	public static void bubbleSort(int []ar)
	{
		int count =0;
		
		for (int i = 0; i < ar.length-1; i++) 
		{
			int ct =0;
			for (int j = 0; j < ar.length-1; j++) 
			{
				
				if(ar[j] > ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
					ct ++;
				}
			}
			count++;
			if(ct == 0)
			{
				break;
			}
			
		}
		
		
		System.out.println(count);
		System.out.println();
		System.out.println(Arrays.toString(ar));
	}
	
	

}
