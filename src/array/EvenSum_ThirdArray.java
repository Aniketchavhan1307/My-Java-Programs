package array;

import java.util.Arrays;

public class EvenSum_ThirdArray
{
	public static void main(String[] args)
	{
		int [] ar = {1,2,3,4,5,6};
		int [] br = {7,8,9,10,11,12,13};
		
		int ct =0;
		int count=0;
		
		for (int i = 0; i < ar.length; i++) 
		{
			if(ar[i] %2==0)
			{
				ct ++;
			}
			
		}
		
		for (int i = 0; i < br.length; i++)
		{
			if(br[i] %2==0)
			{
				count ++;
			}
			
		}
		
		int [] cr = new int[ct+count];
		
		for (int i = 0 , j=0 ; i < ar.length +br.length; i++) 
		{
			if(i<ar.length && ar[i]%2 == 0  )
			{
				cr[j] = ar[i];
				j++;
			}
			
			
						
			 if(i>=ar.length && br[ i-ar.length] %2 == 0 )
			{
				cr[j] = br[i-ar.length];
				j++;
			}
			
			
		}
		
		System.out.println(Arrays.toString(cr));
	}
}
