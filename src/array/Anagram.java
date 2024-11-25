package array;

public class Anagram
{
	public static void main(String[] args) 
	{
		char [] ch1 = {'a','b','c','p','q','r'};
		
		char [] ch2 = {'q','r','p','b','c','a'};
		
		if(ch1.length == ch2.length)
		{
			int i;
			for ( i=0; i<ch1.length; i++)
			{
				int j;
				for( j = 0; j<ch2.length; j++)
				{
					if(ch1[i]== ch2[j])
					{
						break;
					}
				}
				if(j == ch2.length)
				{
					break;
				}
			}
			if(i == ch1.length)
			{
				System.out.println("It is a anagram array");
			}
			else
			{
				System.out.println("It is not anagram array.");
			}
		}
		else
		{
			System.out.println("not anagram array....");
		}
		
	}

}
