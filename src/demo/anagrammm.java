package demo;

public class anagrammm
{
	public static void main(String[] args) 
	{
		int []a = {1,2,6,5,3,4};
		int []b = {2,3,1,4,5,6};
		
	
		if(a.length == b.length)
		{
			int i;
			for ( i = 0; i < b.length; i++) 
			{
				int j;
				for ( j = 0; j < b.length; j++) 
				{
					if(a[i]==b[j])
					{
						break;
					}
				}
				if(j==b.length)
				{
					break;
				}
			}
			if(i==a.length)
			{
				System.out.println("It is an anagram array...");
			}
			else
			{
				System.out.println("It is not anagram array..");
			}
				
		}
		else
		{
			System.out.println("not an anagram array...by their length");
		}
		
		
	}
	

}
