package array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the searching element.... ");
		
		int search = sc.nextInt();
		
		int [] ar = {2,3,6,1,52,25,8,5,24,99,54,51,45,56};
		
		
		
		int start = 0;
		int end = ar.length-1;
		int mid = (start + end)/2;
		
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
		System.out.println(Arrays.toString(ar));
		
		
		while(start <= end) 
		{
			if(search == ar[mid])
			{
				System.out.println("Element found at index---> "+ mid);
				break;
			}
			else if (search > ar[mid]) 
			{
				start = mid + 1;
				
			}
			else if (search < ar[mid])
			{
				end = mid -1;
				
			}
			
			mid = (start + end)/2;
			
			
		}

		if(start>end)
		{
			System.out.println("Element not found...");
			
		}
		
	}

}
