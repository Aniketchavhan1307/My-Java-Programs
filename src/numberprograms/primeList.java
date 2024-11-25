package numberprograms;

import java.util.Scanner;

public class primeList 
{
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the starting Number....");
		int start = sc.nextInt();

		

		System.out.println("Enter the ending Number....");
		int end = sc.nextInt();
		
		for(int i = start; i<= end; i++ )
		{
			int temp = 0;
			
			for(int den=2; den<i; den++)
			{
				if(i%den ==0)
				{
				temp = temp+1;
				}
			}
			
			if(temp == 0)
			{
				System.out.println("prime numbers are-------------->"+i);
			}
		}
	}

}
