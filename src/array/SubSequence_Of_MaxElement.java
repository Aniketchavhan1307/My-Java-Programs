package array;

import java.util.Arrays;

public class SubSequence_Of_MaxElement
{
	public static void main(String[] args) 
	{
		int []ar = {1,1,1,8,8,8,4,4,4,5,5,5,5,5,5};
		int [] count= new int[ar.length];
		
		int ct =1;
		
		for (int i = 0; i < ar.length-1; i++)
		{
			if(ar[i]==ar[i+1])
			{
				count[i+1] = ct;
				ct++;
			}
			else
			{
				ct =1;
			}
			
		}
		
		System.out.println(Arrays.toString(count));
		
		int index = maxIndex(count);
		System.out.println("The maximum subsequence element is "+ar[index]+" which is repeated.."+count[index]+" times");
		
	}
	
	public static int maxIndex(int []count)
	
	{
		int max = -2147483648;
		
		int index =0;
		
		for (int i = 0; i < count.length; i++) 
		{
			if(max<count[i])
			{
				index =i;
				max = count[i];
			}
			
		}
		return index;
	}
}
