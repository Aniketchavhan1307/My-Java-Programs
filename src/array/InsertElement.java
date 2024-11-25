package array;

public class InsertElement 
{
	public static void main(String[] args) 
	{
		int[]ar = {1,2,3,4,5};
		
		try
		{
			int ans[] = insert(ar, 3, 60);
			
			for (int i = 0; i < ans.length; i++)
			{
				System.out.print(ans[i]+",");
				
			}
		}
		catch(NullPointerException e)
		{
			System.out.println("Element could not be inserted as the given index is out of range.....");
		}
		
	}
	
	public static int[] insert(int []ar, int index, int element)
	{
		if(index > 0 && index<ar.length)
		{
			int[] updated = new int[ar.length+1];
			
			for (int i = 0, j=0; i < ar.length; )
			{
				if(index == j)
				{
					updated[j] = element;
					j++;
				}
				else if(j<index || j>index)
				{
					updated[j] = ar[i];
					
					j++;
					i++;
				}
				
			}
			return updated;
					
		}
		else
		{
			return null;
		}
	}

}
