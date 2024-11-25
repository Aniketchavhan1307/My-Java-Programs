package array;

public class uniqueArray {
	
	public static void main(String[] args) {
		
		int []ar = {1,2,3,5,6,65,3265,36,9};
		
		if(isUnique(ar))
		{
			System.out.println("unique array");
		}
		else
		{
			System.out.println("not unique array");
		}
	}
	
	public static boolean isUnique(int []ar)
	{
		for(int i = 0; i<ar.length; i++)
		{
			for(int j= i+1; j<ar.length; j++)
			{
				if(ar[i]==ar[j])
				{
					return false;
				}
			}
			
		}
		return true;
	}

}

