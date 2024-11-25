package array;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Binary
{
	public static void main(String[] args)
	{
		int [] ar = {1,2,5,8,50,200,500,800,1000};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the searching element...");
		int search = sc.nextInt();
		
		Arrays.sort(ar);
		
		System.out.println(binarySearch(search, ar));
		System.out.println(binarySearch(ar, search));
	}
	
	public static boolean binarySearch(int []ar , int search)
	{
		int start = 0;
		int end = ar.length -1;
		int mid = (start + end)/2;
		
		while(start <= end)
		{
			if(search == ar[mid])
			{
				return true;
			}
			
			else if (search > ar[mid])
			{
				start = mid+1;
				
			}
			else if (search < ar[mid])
			{
				end = mid -1;
			}
			mid = (start + end)/2;
			
		}
		return false;
		
	
	}
	
	public static int binarySearch(int search, int []ar)
	{
		int start = 0;
		int end = ar.length-1;
		int mid = (start + end )/2;
		
		while(start<=end)
		{
			if(search == ar[mid])
			{
				return mid;
			}
			else if (search> ar[mid])
			{
				start = mid +1;
				
			}
			else if (search < ar[mid])
			{
				end = mid -1;
			}
			mid = (start + end)/2;
		}
		return -1;
	}
	
	

}
