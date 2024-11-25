package strings;

import java.util.Arrays;

public class RemoveDupChar_MergeSort
{
	public static void main(String[] args) 
	{
		String str = "abcdacdepqrst";
		
		sort(str);
		
	}
	
	public static void sort(String str)
	{
		char [] ch = str.toCharArray();
		
		System.out.println("Before sorting .... "+ Arrays.toString(ch));
		
		mergeSort(ch, 0, ch.length-1);
		
		System.out.println("after sorting .... "+ Arrays.toString(ch));
		
		String s = new String(ch);
		System.out.println("After sorting the String......."+s);
		
		char[] ch2 = frequency(ch);
		System.out.println(ch2);
		System.out.println(Arrays.toString(ch2));
		
		
	}
	
	public static void mergeSort(char[]ch, int low, int high)
	{
		if(low<high)
		{
		
			int mid = (low + high)/2;
			
			mergeSort(ch, low, mid);
			mergeSort(ch, mid+1, high);
			
			merge(ch, low , mid, high);
			
			
		}
	}

	public static void merge(char[] ch, int low, int mid, int high)
	{
		char [] ans = new char[ch.length];
		
		int i = low , j = mid+1, k = low;
		
		while(i<= mid && j<= high)
		{
			if(ch[i] < ch[j])
			{
			
				ans[k] = ch[i];
				k++;
				i++;
				
			}
			else
			{
				ans[k++] = ch[j++];
			}
		}
		
		while(i<= mid)
		{
			ans[k++] = ch[i++];
		}
		
		while(j<= high)
		{
			ans[k++] = ch[j++];
		}
		
		for(int k2 = low; k2<= high; k2++)
		{
			ch[k2] = ans[k2];
		}
		
		
		
	}
	
	public static char[] frequency(char[]ch)
	
	{
		int count[] = new int[ch.length];
		int dup = 0;
		
		for (int i = 0; i < count.length; i++)
		{
			int ct = 1;
			for (int j = i+1; j < count.length; j++)
			{
				if(ch[i] == ch[j])
				{
					count[j] = -1;
					ct++;
				}
			}
			if(count[i]!= -1)
			{
				count[i] = ct;
			}
			
			if(count[i]== -1)
			{
				dup++;
			}
			
		}
		
		char[] unique = new char[ch.length-dup];
		
		for (int i = 0, j= 0; i < count.length; i++)
		{
			if(count[i] != -1 )
			{
				unique[j] = ch[i];
				j++;
			}
			
		}
		
		return unique;
		
	}
	
	
	
	

}
