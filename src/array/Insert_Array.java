package array;

import java.util.Arrays;

public class Insert_Array 
{
	public static void main(String[] args) 
	{
		int [] ar = {1,2,3,4,5,6,7,8};
		int [] br = {10,20,30,40,50,60,70,80,90,100};
		
		
		System.out.println(Arrays.toString(insertArray(ar, br, 4)));
		
	}
	
	public static int [] insertArray(int []ar, int []br , int index)
	{
		int [] ans = new int[ar.length + br.length];
		
		for (int i = 0; i < ans.length; i++) 
		{
			if(i < index)
			{
				ans[i] = ar[i];
			}
			else if(i>= index && i - index < br.length)
			{
				ans[i]= br[i-index];
				
				
			}
			else
			{
				ans[i] = ar[i - br.length];
			}
			
		}
		
		return ans;
	}

}
