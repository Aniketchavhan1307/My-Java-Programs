package array;

import java.util.Arrays;

public class FrequnecyOfArray 
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,4,5,1,2,5,1,26,6,8,26,1};
		
		int count[] = new int[a.length];
		
			
		for (int i = 0; i <a.length; i++)
		{
			int ct=0;
			
			for (int j = i+1; j < count.length; j++) 
			{
				if(a[i]== a[j])
				{
					ct++;
					count[j] = -1;
				}
			}
			if(count[i] != -1)
			{
				count[i] = ct;
			}
			
		}
		
		System.out.println(Arrays.toString(count));
		System.out.println("==========================");
		for (int i = 0; i < count.length; i++) 
		{
			
			if(count[i] != -1)
			{
				System.out.println(a[i]+" is repeated "+count[i]+" times");
			}
		}
		
	}

}
