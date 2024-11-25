package array;

public class Find_SecondMaxElement {

	public static void main(String[] args)
	{
		int[]ar = {1,2,3,54,6,6,41,25,12,36,78,78,79};
		
		int max = Integer.MAX_VALUE;
		int secMax = 2147483647;
		
		for (int i = 0; i < ar.length; i++) 
		{
			if (ar[i]<max) 
			{
				secMax = max;
				max = ar[i];
				
				
			}
			else if(ar[i]<secMax && ar[i]!= max)
			{
				secMax = ar[i];
			}
			
		}
		System.out.println(secMax);
		System.out.println(max);

	}

}
