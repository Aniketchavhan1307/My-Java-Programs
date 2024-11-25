package demo;

import java.util.Arrays;

public class SampleProgramOfMergeSort 
{
	public static void main(String[] args) 
	{
		int []ar = {2,56,45,14,18,51,65,8,57};
		
		mergeSort(ar, 0, ar.length-1);
		
		System.out.println(Arrays.toString(ar));
		
	}
	
	public static void mergeSort(int []ar, int low , int high)
	{
		if(low < high)
		{
			int mid =(low + high)/2;
			
			mergeSort(ar, low, mid);
			mergeSort(ar, mid+1, high);
			merge(ar, low, mid, high);
		}
	}
	
	public static void merge(int []ar, int low , int mid, int high)
	{
		int []ans = new int[ar.length];
		
		int i = low, j = mid+1, k = low;
		
		while(i<= mid && j<= high)
		{
			if(ar[i]<ar[j])
			{
				ans[k]= ar[i];
				k++;
				i++;
				
			}
			else
			{
				ans[k]= ar[j];
				k++;
				j++;
			}
		}
		
		while(i<=mid)
		{
			ans[k++] = ar[i++];
		}
		
		while(j<= high)
		{
			ans[k++]=ar[j++];
		}
		
		for (int k2 = low; k2 <= high; k2++)
		{
			ar[k2] = ans[k2];
			
		}
	}

}
