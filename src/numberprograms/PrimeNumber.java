package numberprograms;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the starting Number....");
		int start = sc.nextInt();
		
					int den;
					for( den = 2; start>den; den++)
					{
						if(start%den==0)
						{
							break;
						}
						
					}
					
				
		
		if(start==den)
		{
			System.out.println("number is prime------>"+ start);
		}
		else
		{
			System.out.println("number is not prime");
		}
	
	}
	

}
