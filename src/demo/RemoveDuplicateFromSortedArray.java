package demo;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray
{
	
		public static void main(String[] args) 
		{
			int[] ar = {5,6,3,2,-65,0,-62,59,4,2,1,4,6,3,9};
			//int[]ar = {1,2,3,4,7,5,6,0};
			
			//char [] ar = {'d','y','r','e','t','l','a','b','E','A'};
			int ct =0;
			
			for (int i = 0; i < ar.length-1; i++) 
			{
				
				
				for (int j = 0; j < ar.length-1-i; j++) 
				{
					if(ar[j]>ar[j+1])
					{
						int temp = ar[j];
						ar[j] = ar[j+1];
						ar[j+1]= temp;
						
					}
					
				}
				
				
				
			}
			for (int i = 0; i < ar.length-1; i++) {
			
				if(ar[i]==ar[i+1])
				{
					ct++;
					ar[i+1]=-1;
				}
			}
			
			int unique []= new int[ar.length-ct];
			
			for (int i = 0, j=0; i < ar.length; i++) 
			{
				if(ar[i]!=-1)
				{
					unique[j] = ar[i];
					j++;
				}
				
			}
			
			
			System.out.println(Arrays.toString(unique));
			System.out.println("===================================");
			
			System.out.println(Arrays.toString(ar));
		}

	}
	
	


