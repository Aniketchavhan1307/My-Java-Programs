package strings;

public class SearchCharacter 
{
	public static void main(String[] args)
	{
		String ip = "Deccan Gymkhana";
		
		System.out.println(returnIndex(ip, 'm'));
		
	}
	
	public static int returnIndex(String ip, char search)
	{
		for (int i = 0; i < ip.length(); i++) 
		{
			if(ip.charAt(i) == search)
			{
				return i;
			}
			
			
		}
		return -1;
	}

}
