package strings;

public class RemoveCharacterFromString 
{ 
	public static void main(String[] args) 
	{
		String ip = "Aeroplane";
		
		String ans = "";
		
		char ch ='e';
		
		for (int i = 0; i < ip.length(); i++)
		{
			if(ch != ip.charAt(i))
			{
				ans = ans + ip.charAt(i);
			}
			
		}
		
		System.out.println(ans);
		
	}

}
