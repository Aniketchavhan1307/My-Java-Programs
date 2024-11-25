package array;

import java.util.Arrays;


public class Frequency1 
{
	public static void main(String[] args) 
	{
		int [] a = {1,2,3,5,11,13,1,2,3,1,6,1,8,8,4};
		
		int count[] = new int[a.length];
		int dup = 0;
		
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
			
			if(count[i] == -1)
			{
				dup ++;
			}
		
		}
		int [] unique = new int[a.length-dup];
		
		for (int j = 0 ,i = 0; i < a.length ; i++) 
		{
			
			if(count[i] != -1 )
			{
				unique[j] = a[i];
	
				j++;
			}

		}
		
		for (int i = 0; i < unique.length-1; i++) 
		{
			for (int j = 0; j < unique.length-1-i; j++) 
			{
				if(unique[j]>unique[j+1])
				{
					int temp = unique[j];
					unique[j]=unique[j+1];
					unique[j+1]=temp;
				}
			}
			
		}
		
		
		
		System.out.println("unique length  "+unique.length);
		System.out.println("a [] length  "+a.length);
		System.out.println("Duplicates element count --> "+dup);
		System.out.println(Arrays.toString(count));
		System.out.println(Arrays.toString(a));  
		System.out.println(Arrays.toString(unique));
		
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
