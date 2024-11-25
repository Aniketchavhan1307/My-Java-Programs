package array;

import java.util.Arrays;

public class MergeSort 
{
	public static void main(String[] args)
	{
		int []ar = {5,2,41,65,4,-9,74,52,67,78};
		
		mergeSort(ar, 0, ar.length-1);
		
		System.out.println(Arrays.toString(ar));
	}
	
	public static void mergeSort(int []ar, int low , int high)
	{
		if(low < high)
		{
			int mid = (low + high )/2;
			
			mergeSort(ar, low, mid);
			
			mergeSort(ar, mid+1, high);
			
			merge(ar, low, mid, high);
		}
		
	}
	
	public static void merge(int []ar , int low, int mid, int high)
	{
		int []ans = new int [ar.length];
		
		int i =low;
		int j = mid+1;
		int k =low;
		
		
		while(i<=mid && j<=high)
		{
			if (ar[i]<ar[j])
			{
				ans[k] = ar[i];
				k++;
				i++;
			}
			else
			{
				ans[k++] = ar[j++];
			}
		}
		
		while(i<= mid)
		{
			ans[k++]= ar[i++];
		}
		
		while(j<= high)
		{
			ans[k]= ar[j];
			k++;
			j++;
		}
		
		for (int k2 = low; k2 <= high; k2++) 
		{
			ar[k2]= ans[k2];
			
		}
	
	}

}
